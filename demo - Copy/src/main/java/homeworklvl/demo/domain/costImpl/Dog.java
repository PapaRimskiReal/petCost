package homeworklvl.demo.domain.costImpl;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

import homeworklvl.demo.domain.modelCost.Cost;
import homeworklvl.demo.domain.modelCost.CostAbstractPetWithToy;

@Entity
@Table(name = "dogs")
public class Dog extends CostAbstractPetWithToy implements Cost {

	@Positive
	@Max(value = 200000, message = "Should not be greater than 2000")
	private long training = 0;

	public long getTraining() {
		return training;
	}

	public void setTraining(long training) {
		this.training = training;
	}

	@Override
	public long getTotal() {

		total = food + healthCare + other + equipment + toys + training;

		return total;
	}

}
