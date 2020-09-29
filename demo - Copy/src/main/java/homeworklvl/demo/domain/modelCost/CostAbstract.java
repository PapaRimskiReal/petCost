package homeworklvl.demo.domain.modelCost;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

import org.springframework.format.annotation.DateTimeFormat;

import homeworklvl.demo.domain.petCost.PetCost;

@MappedSuperclass
public abstract class CostAbstract{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "petCost_id")
	private PetCost petCost;
	
	@JoinColumn
	@Positive
	@Max(value = 200000, message = "Should not be greater than 2000")
	protected long food = 0;
	
	@JoinColumn
	@Positive
	@Max(value = 100000, message = "Should not be greater than 1000")
	protected long healthCare = 0;
	
	@JoinColumn
	@Positive
	@Max(value = 1000000, message = "Should not be greater than 10000")
	protected long equipment = 0;
	
	@JoinColumn
	@Positive
	@Max(value = 5000000, message = "Should not be greater than 50000")
	protected long other = 0;
	
	@JoinColumn
	protected long total = 0;
	
	@JoinColumn
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

	public PetCost getPetCost() {
		return petCost;
	}

	public void setPetCost(PetCost petCost) {
		this.petCost = petCost;
	}

	public long getId() {
		return id;
	}

	public long getTotal() {
		
		total = food + healthCare + equipment + other;
		return total;
	}

	
	
}
