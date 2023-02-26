package FirstProject.Cataloger.dto;

import FirstProject.Cataloger.model.GameGenre;
import FirstProject.Cataloger.model.Platform;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameDTO {
    private String title;

    private Integer yearOfPublication;

    private Platform platform;

    private GameGenre gameGenre;

}
