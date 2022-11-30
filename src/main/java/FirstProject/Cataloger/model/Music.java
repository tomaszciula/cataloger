package FirstProject.Cataloger.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Getter
@Setter
@Entity
@Data
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "yearOfPublication", nullable = false)
    private Integer yearOfPublication;
    @Column(name = "media", nullable = false)
    private Media media;
    @Column(name = "musicGenre", nullable = false)
    private MusicGenre musicGenre;

    @ManyToOne
    @JoinColumn(name = "cataloger_user_id")
    private CatalogerUser catalogerUser;
}

