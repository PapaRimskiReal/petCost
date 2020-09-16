package homeworklvl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.petCost.PetCost;

@Repository
public interface PetCostRepository  extends JpaRepository<PetCost, Long> {

}
