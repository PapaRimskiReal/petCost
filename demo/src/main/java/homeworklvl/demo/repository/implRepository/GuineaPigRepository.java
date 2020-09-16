package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.GuineaPig;

@Repository
public interface GuineaPigRepository extends JpaRepository<GuineaPig, Long> {

}
