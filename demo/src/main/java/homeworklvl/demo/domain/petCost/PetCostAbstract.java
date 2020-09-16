package homeworklvl.demo.domain.petCost;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class PetCostAbstract {

	@JoinColumn
	protected Date date;
	
	@JoinColumn
	protected Long Total = (long) 0;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getTotal() {
		return Total;
	}
	public void setTotal(Long total) {
		Total = total;
	}
	
	
}
