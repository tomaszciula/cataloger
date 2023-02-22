package FirstProject.Cataloger.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Game {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private Integer yearOfPublication;

    private Platform platform;

    private GameGenre gameGenre;

}
