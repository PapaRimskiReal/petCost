package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Hedgehog;

@Repository
public interface HedgehogRepository extends JpaRepository<Hedgehog, Long> {

}
