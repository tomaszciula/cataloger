package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.dto.GameDTO;
import FirstProject.Cataloger.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("cataloger/game/add")
    public GameDTO addGame(@RequestBody GameDTO gameDTO) {
        return gameService.addGame(gameDTO);
    }

    @PutMapping("cataloger/game/{gameId}")
    public GameDTO editGame(@RequestBody GameDTO gameDTO, @PathVariable Long gameId) {
        return gameService.editGame(gameDTO, gameId);
    }

    @DeleteMapping("cataloger/game/{gameId}")
    public void deleteGame(@PathVariable Long gameId) {
        gameService.deleteGame(gameId);
    }

}
