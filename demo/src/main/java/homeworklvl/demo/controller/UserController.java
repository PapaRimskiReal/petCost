package homeworklvl.demo.controller;

import static org.hamcrest.CoreMatchers.is;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import homeworklvl.demo.domain.modelCost.Cost;
import homeworklvl.demo.domain.modelPet.Pet;
import homeworklvl.demo.domain.modelPet.PetType;
import homeworklvl.demo.domain.modelUser.User;
import homeworklvl.demo.repository.CostRepository;
import homeworklvl.demo.repository.PetRepository;
import homeworklvl.demo.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	private User user;
//	private Date date;
		
	Authentication authentication;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PetRepository petRepository;
	@Autowired
	CostRepository costRepository;
	
	
	@RequestMapping
	public String userPage(Model model, @ModelAttribute Pet pet) {

		authentication = SecurityContextHolder.getContext().getAuthentication();
		user = userRepository.findByUsername(authentication.getName());
		
		List<Pet> petList = user.getPets();
		model.addAttribute("petList", petList);
		
		return "user";
	}
	
	@RequestMapping("/pet_registration")
	public String petRegistrationForm(@ModelAttribute Pet pet, Model model) {
		
		model.addAttribute("petType", PetType.values());
		
		return "petRegistration";
	}
	
	@PostMapping("/pet_registration")
	public String postNewPet(@ModelAttribute Pet pet) throws ParseException {

		authentication = SecurityContextHolder.getContext().getAuthentication();
		user = userRepository.findByUsername(authentication.getName());
		pet.setUser(user);
		pet.setPetRegistrationDate(new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.now().toString()));
		
		petRepository.save(pet);
		
		
		return "redirect:/user";
	}
	
	@RequestMapping("/pet/")
	public String showPet(@RequestParam("name") String petName, Model model,
			@ModelAttribute Pet pet, @ModelAttribute Cost cost) {
		
		pet = petRepository.findByPetName(petName);
		cost.setPet(pet);
		List<Cost> costList = pet.getCosts();
		model.addAttribute("costList" ,costList);
		model.addAttribute("pet", pet);
		model.addAttribute("cost", cost);
		
		return "pet";
	}
	
	@PostMapping("/pet/")
	public String showPetPost(@RequestParam("name") String petName, Model model,
			@ModelAttribute Pet pet, @ModelAttribute Cost cost) throws ParseException {
		
		pet = petRepository.findByPetName(petName);
		cost.setPet(pet);
		
		cost.setTotal(cost.getTotal());
		cost.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(LocalDate.now().toString()));
		costRepository.save(cost);
		
		
		return "redirect:/user/pet/?name=" + pet.getPetName();
	}

}
