package FirstProject.Cataloger.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Vinyl {

    @Id
    @GeneratedValue
    private Long id;

    private String bandName;

    private String title;

    private Integer yearOfPublication;

    private MusicGenre musicGenre;

    private SizeVinyl sizeVinyl;

}
