package homeworklvl.demo.domain.petCost;

import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PetCostAbstract {

	@JoinColumn
	protected Long Total = (long) 0;

	public Long getTotal() {
		return Total;
	}
	public void setTotal(Long total) {
		Total = total;
	}
	
	
}
