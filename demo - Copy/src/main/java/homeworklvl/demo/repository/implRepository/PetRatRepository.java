package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.PetRat;

@Repository
public interface PetRatRepository extends JpaRepository<PetRat, Long> {

}
