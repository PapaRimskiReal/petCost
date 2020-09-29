package homeworklvl.demo.modelCost.Impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import homeworklvl.demo.domain.modelCost.Cost;


public class DogTest {

	@Test
	public void costGetTotalTest() {
		
		Cost dog = new Cost();
		dog.setEquipment(1);
		dog.setFood(1);
		dog.setHealthCare(1);
		dog.setOther(1);
		dog.setToys(1);
				
				
		assertThat(dog.getTotal()).isEqualTo(5);
		
	}
}