package homeworklvl.demo.domain.costImpl;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Positive;

import homeworklvl.demo.domain.modelCost.Cost;
import homeworklvl.demo.domain.modelCost.CostAbstract;

@Entity
@Table(name = "aquariums")
public class Aquarium extends CostAbstract implements Cost{

	@Positive
	@Max(value = 10000000, message = "Should not be greater than 1000000")
	protected long decoration = 0;

	public long getDecoration() {
		return decoration;
	}

	public void setDecoration(long decoration) {
		this.decoration = decoration;
	}
	
	@Override
	public long getTotal() {
		
		total = food + healthCare + other + equipment + decoration;
		
		return total;
	}
}
