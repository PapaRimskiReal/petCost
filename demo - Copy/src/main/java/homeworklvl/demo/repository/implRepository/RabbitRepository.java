package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Rabbit;

@Repository
public interface RabbitRepository extends JpaRepository<Rabbit, Long> {

}
