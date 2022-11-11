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
public class CatalogerUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", nullable  = false)
    private String name;
    @Column(name = "pass", nullable = false)
    private String pass;
    @Column(name = "email", nullable = false)
    private String email;
}
