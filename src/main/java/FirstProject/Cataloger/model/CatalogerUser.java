package FirstProject.Cataloger.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pass", nullable = false)
    private String pass;
    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "catalogerUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Game> games = new HashSet<>();

    @OneToMany(mappedBy = "catalogerUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Vinyl> vinyls = new HashSet<>();

    @OneToMany(mappedBy = "catalogerUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Book> books = new HashSet<>();

    @OneToMany(mappedBy = "catalogerUser", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Music> media = new HashSet<>();
}


