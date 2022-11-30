package FirstProject.Cataloger.repository;

import FirstProject.Cataloger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
