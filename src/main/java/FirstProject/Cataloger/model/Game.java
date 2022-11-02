package FirstProject.Cataloger.model;

import lombok.*;
import javax.persistence.*;

//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Getter
@Setter
@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "yearOfPublication")
    private Integer yearOfPublication;
    @Column(name = "platform")
    private Platform platform;
    @Column(name = "gameGenre")
    private GameGenre gameGenre;
}

