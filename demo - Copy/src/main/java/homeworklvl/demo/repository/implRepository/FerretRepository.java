package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Ferret;

@Repository
public interface FerretRepository extends JpaRepository<Ferret, Long> {

}
