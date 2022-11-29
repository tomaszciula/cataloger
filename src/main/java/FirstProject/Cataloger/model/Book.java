package FirstProject.Cataloger.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

//@AllArgsConstructor
//@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "yearOfPublication", nullable = false)
    private Integer yearOfPublication;
    @Column(name = "bookType", nullable = false)
    private BookType bookType;

    @ManyToOne
    @JoinColumn(name = "cataloger_user_id")
    private CatalogerUser catalogerUser;
}
