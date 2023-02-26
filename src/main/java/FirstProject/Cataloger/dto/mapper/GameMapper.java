package FirstProject.Cataloger.dto.mapper;

import FirstProject.Cataloger.dto.GameDTO;
import FirstProject.Cataloger.model.Game;

public class GameMapper {

    public static Game mapToGame(GameDTO gameDTO) {
        Game game = new Game();
        game.setGameGenre(gameDTO.getGameGenre());
        game.setPlatform(gameDTO.getPlatform());
        game.setTitle(gameDTO.getTitle());
        game.setYearOfPublication(gameDTO.getYearOfPublication());
        return game;
    }

    public static GameDTO mapToDTO(Game game) {
        GameDTO gameDTO = new GameDTO();
        gameDTO.setGameGenre(game.getGameGenre());
        gameDTO.setPlatform(game.getPlatform());
        gameDTO.setTitle(game.getTitle());
        gameDTO.setYearOfPublication(game.getYearOfPublication());
        return gameDTO;
    }

}
