package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Hamster;

@Repository
public interface HamsterRepository extends JpaRepository<Hamster, Long> {

}
