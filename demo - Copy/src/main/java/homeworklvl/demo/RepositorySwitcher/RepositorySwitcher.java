package homeworklvl.demo.RepositorySwitcher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import homeworklvl.demo.domain.modelPet.Pet;
import homeworklvl.demo.repository.implRepository.DogRepository;
import homeworklvl.demo.repository.implRepository.RabbitRepository;

public class RepositorySwitcher {

	@Autowired
	DogRepository dogRepository;
	@Autowired
	RabbitRepository rabbitRepository;

	public JpaRepository<?, ?> getRepository(Pet pet) {

		switch (pet.getPetType()) {
		case Dog:
			return dogRepository;
		case Cat:
			return rabbitRepository;

		default:
			break;
		}

		return null;

	}
}
