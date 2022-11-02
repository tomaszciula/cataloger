package FirstProject.Cataloger.model;

import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class User {
    private String name;
    private String pass;
    private String email;
}
