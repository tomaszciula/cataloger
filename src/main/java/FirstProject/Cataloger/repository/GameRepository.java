package FirstProject.Cataloger.repository;

import FirstProject.Cataloger.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
