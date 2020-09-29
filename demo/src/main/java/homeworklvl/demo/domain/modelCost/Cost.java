package homeworklvl.demo.domain.modelCost;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

import homeworklvl.demo.domain.modelPet.Pet;

@Entity
@Table(name = "cost")
public class Cost{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	
	@Positive
	@Max(value = 200000, message = "Should not be greater than 2000")
	protected long food;
	
	@Positive
	@Max(value = 100000, message = "Should not be greater than 1000")
	protected long healthCare;
	
	@Positive
	@Max(value = 100000, message = "Should not be greater than 1000")
	protected long toys;
	
	@Positive
	@Max(value = 1000000, message = "Should not be greater than 10000")
	protected long equipment;
	
	@Positive
	@Max(value = 5000000, message = "Should not be greater than 50000")
	protected long other;
	
	protected long total = 0;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	protected Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public long getFood() {
		return food;
	}

	public void setFood(long food) {
		this.food = food;
	}

	public long getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(long healthCare) {
		this.healthCare = healthCare;
	}

	public long getEquipment() {
		return equipment;
	}

	public void setEquipment(long equipment) {
		this.equipment = equipment;
	}

	public long getOther() {
		return other;
	}

	public void setOther(long other) {
		this.other = other;
	}

	public long getId() {
		return id;
	}
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public long getToys() {
		return toys;
	}

	public void setToys(long toys) {
		this.toys = toys;
	}

	public Date getDate() {
		return date;
	}

	public long getTotal() {
		
		total = food + healthCare + equipment + toys + other;
		return total;
	}

	
	
}
