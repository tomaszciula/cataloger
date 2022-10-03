package FirstProject.Cataloger.model;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class Game {
    private String title;
    private Integer yearOfPublication;
    private Platform platform;
    private GameGenre gameGenre;
}
