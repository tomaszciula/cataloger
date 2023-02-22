package FirstProject.Cataloger.dto;

import FirstProject.Cataloger.model.MusicGenre;
import FirstProject.Cataloger.model.SizeVinyl;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VinylDTO {

    private String bandName;

    private String title;

    private Integer yearOfPublication;

    private MusicGenre musicGenre;

    private SizeVinyl sizeVinyl;

}
