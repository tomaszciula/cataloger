package FirstProject.Cataloger.repository;

import FirstProject.Cataloger.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<Music, Long> {
}
