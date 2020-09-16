package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Gerbil;

@Repository
public interface GerbilRepository extends JpaRepository<Gerbil, Long> {

}
