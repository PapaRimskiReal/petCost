package homeworklvl.demo.repository.implRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.costImpl.Dog;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {

}
