package homeworklvl.demo.domain.modelCost;

import javax.persistence.JoinColumn;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

public abstract class CostAbstractPetWithToy extends CostAbstract{

	@JoinColumn
	@Positive
	@Max(value = 500000, message = "Should not be greater than 5000")
	protected long toys = 0;

	public long getToys() {
		return toys;
	}

	public void setToys(long toys) {
		this.toys = toys;
	}

	@Override
	public long getTotal() {

		total = food + healthCare + other + equipment + toys;

		return total;
	}
}
