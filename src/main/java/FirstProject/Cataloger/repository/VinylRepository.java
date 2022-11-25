package FirstProject.Cataloger.repository;

import FirstProject.Cataloger.model.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VinylRepository extends JpaRepository<Vinyl, Long> {
}
