package homeworklvl.demo.domain.costImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

import homeworklvl.demo.domain.modelCost.Cost;
import homeworklvl.demo.domain.modelCost.CostAbstractPetWithToy;

@Entity
@Table(name = "birds")
public class Bird extends CostAbstractPetWithToy implements Cost{

	
}