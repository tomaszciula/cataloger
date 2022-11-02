package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.model.Game;
import FirstProject.Cataloger.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class GameController {
    @Autowired
    GameRepository gameRepository;

    @GetMapping("/games")
    List<Game> all() {
        return gameRepository.findAll();
    }

    @PostMapping("/games")
    Game newGame(@RequestBody Game newGame) {
        return gameRepository.save(newGame);
    }

    @PutMapping("/games/{id}")
    Game updateGame(@RequestBody Game newGame, @PathVariable Long id) {
        return gameRepository.findById(id).map(item -> {
                    item.setTitle(newGame.getTitle());
                    item.getYearOfPublication();
                    item.getPlatform();
                    item.getGameGenre();
                    return gameRepository.save(item);
                })
                .orElseGet(() -> {
                    newGame.setId(id);
                    return gameRepository.save(newGame);
                });
    }

    @DeleteMapping("/games/{id}")
    void deleteGame(@PathVariable Long id) {
        gameRepository.deleteById(id);
    }
}
