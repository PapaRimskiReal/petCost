package homeworklvl.demo.domain.costImpl;

import javax.persistence.Entity;
import javax.persistence.Table;

import homeworklvl.demo.domain.modelCost.Cost;
import homeworklvl.demo.domain.modelCost.CostAbstractPetWithToy;

@Entity
@Table(name = "guinea_pig")
public class GuineaPig extends CostAbstractPetWithToy implements Cost{

}
