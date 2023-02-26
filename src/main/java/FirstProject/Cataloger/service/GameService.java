package FirstProject.Cataloger.service;

import FirstProject.Cataloger.dto.GameDTO;
import FirstProject.Cataloger.dto.mapper.GameMapper;
import FirstProject.Cataloger.model.Game;

import FirstProject.Cataloger.repo.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepo gameRepo;

    @Autowired
    public GameService(GameRepo gameRepo) {
        this.gameRepo = gameRepo;
    }

    public GameDTO addGame(GameDTO gameDTO) {
        gameRepo.save(GameMapper.mapToGame(gameDTO));
        return gameDTO;
    }

    public GameDTO editGame(GameDTO gameDTO, Long gameId) {
        Game game = gameRepo.findById(gameId).orElseThrow();
        game.setGameGenre(gameDTO.getGameGenre());
        game.setTitle(gameDTO.getTitle());
        game.setPlatform(gameDTO.getPlatform());
        game.setYearOfPublication(gameDTO.getYearOfPublication());
        gameRepo.save(game);
        return GameMapper.mapToDTO(game);

    }

    public void deleteGame(Long gameId) {
        gameRepo.deleteById(gameId);
    }

}

