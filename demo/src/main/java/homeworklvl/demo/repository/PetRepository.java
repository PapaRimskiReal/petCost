package homeworklvl.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import homeworklvl.demo.domain.modelPet.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
	Pet findByPetName(String petName);

}
