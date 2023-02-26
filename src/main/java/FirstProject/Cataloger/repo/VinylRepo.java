package FirstProject.Cataloger.repo;

import FirstProject.Cataloger.model.Vinyl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinylRepo extends JpaRepository<Vinyl,Long> {
}
