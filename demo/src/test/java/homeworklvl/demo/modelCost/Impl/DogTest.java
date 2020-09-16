package homeworklvl.demo.modelCost.Impl;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import homeworklvl.demo.domain.costImpl.Dog;
import homeworklvl.demo.domain.costImpl.Ferret;
import homeworklvl.demo.domain.modelCost.Cost;


public class DogTest {

	@Test
	public void dogGetTotalTest() {
		
		Dog dog = new Dog();
		dog.setEquipment(1);
		dog.setFood(1);
		dog.setHealthCare(1);
		dog.setOther(1);
		dog.setToys(1);
		dog.setTraining(1);
		
		Cost cost = dog;
		
		assertThat(cost.getTotal()).isEqualTo(6);
		
	}
	
	@Test
	public void ferretGetTotalTest() {
		
		Ferret ferret = new Ferret();
		ferret.setEquipment(1);
		ferret.setFood(1);
		ferret.setHealthCare(1);
		ferret.setOther(1);
		ferret.setToys(1);
		
		Cost cost = ferret;
		
		assertThat(cost.getTotal()).isEqualTo(5);
}}