package FirstProject.Cataloger.repository;

import FirstProject.Cataloger.model.CatalogerUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CatalogerUser, Long> {
}
