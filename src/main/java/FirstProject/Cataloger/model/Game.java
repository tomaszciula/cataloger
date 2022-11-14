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
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "yearOfPublication", nullable = false)
    private Integer yearOfPublication;
    @Column(name = "platform", nullable = false)
    private Platform platform;
    @Column(name = "gameGenre", nullable = false)
    private GameGenre gameGenre;
}

