package homeworklvl.demo.domain.petCost;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import homeworklvl.demo.domain.costImpl.Aquarium;
import homeworklvl.demo.domain.costImpl.Bird;
import homeworklvl.demo.domain.costImpl.Cat;
import homeworklvl.demo.domain.costImpl.Dog;
import homeworklvl.demo.domain.costImpl.Gerbil;
import homeworklvl.demo.domain.costImpl.GuineaPig;
import homeworklvl.demo.domain.costImpl.Hamster;
import homeworklvl.demo.domain.costImpl.Hedgehog;
import homeworklvl.demo.domain.costImpl.PetRat;
import homeworklvl.demo.domain.costImpl.Rabbit;
import homeworklvl.demo.domain.modelPet.Pet;

@Entity
@Table(name = "petCost")
public class PetCost extends PetCostAbstract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Dog> dogCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Cat> catCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Bird> birdCosts;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Aquarium> aquariumirdCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Gerbil> gerbilCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<GuineaPig> guineaPigCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Hamster> hamsterPigCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Hedgehog> hedgehogCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<PetRat> petRatCosts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "petCost")
	private List<Rabbit> rabbitCosts;
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public List<Dog> getCosts() {
		return dogCosts;
	}

	public void setCosts(List<Dog> costs) {
		this.dogCosts = costs;
	}
	
	public List<Dog> getDogCosts() {
		return dogCosts;
	}

	public void setDogCosts(List<Dog> dogCosts) {
		this.dogCosts = dogCosts;
	}

	public List<Cat> getCatCosts() {
		return catCosts;
	}

	public void setCatCosts(List<Cat> catCosts) {
		this.catCosts = catCosts;
	}

	public List<Bird> getBirdCosts() {
		return birdCosts;
	}

	public void setBirdCosts(List<Bird> birdCosts) {
		this.birdCosts = birdCosts;
	}

	public Long getId() {
		return id;
	}
	
	
	
}
