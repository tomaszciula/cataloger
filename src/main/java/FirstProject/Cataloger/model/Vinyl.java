package FirstProject.Cataloger.model;

import lombok.*;

import javax.persistence.*;

//@AllArgsConstructor
//@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
@Data
public class Vinyl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String bandName;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "yearOfPublication", nullable = false)
    private Integer yearOfPublication;
    @Column(name = "musicGenre", nullable = false)
    private MusicGenre musicGenre;
    @Column(name = "sizeVinyl", nullable = false)
    private SizeVinyl sizeVinyl;

    @ManyToOne
    @JoinColumn(name = "cataloger_user_id")
    private CatalogerUser catalogerUser;
}
