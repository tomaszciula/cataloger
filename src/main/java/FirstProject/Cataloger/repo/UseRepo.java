package FirstProject.Cataloger.repo;

import FirstProject.Cataloger.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UseRepo extends JpaRepository<User,Long> {
}
