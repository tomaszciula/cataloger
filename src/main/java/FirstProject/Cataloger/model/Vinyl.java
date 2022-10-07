package FirstProject.Cataloger.model;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Vinyl {
    private String bandName;
    private String title;
    private Integer yearOfPublication;
    private MusicGenre musicGenre;
    private SizeVinyl sizeVinyl;
}
