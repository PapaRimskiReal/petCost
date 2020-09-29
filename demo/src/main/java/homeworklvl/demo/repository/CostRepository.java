package homeworklvl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.modelCost.Cost;

@Repository
public interface CostRepository  extends JpaRepository<Cost, Long> {

}
