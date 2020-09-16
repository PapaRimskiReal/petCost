package homeworklvl.demo.controller;

import java.util.ArrayList;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import homeworklvl.demo.domain.modelPet.Pet;
import homeworklvl.demo.domain.modelPet.PetType;
import homeworklvl.demo.domain.modelUser.User;
import homeworklvl.demo.repository.PetRepository;
import homeworklvl.demo.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	private final String USER_JSP = "user";
	private User user;
	private ModelAndView model;
	
	Authentication authentication;
	
	UserRepository userRepository;
	PetRepository petRepository;
	
	@RequestMapping
	public String userPage(@RequestParam("id") long userId, Model model,
	@ModelAttribute Pet pet) {
		
		authentication = SecurityContextHolder.getContext().getAuthentication();
		
		user = userRepository.findById(userId).get();
		
		ArrayList<Pet> petList = (ArrayList<Pet>) user.getPets();
		model.addAllAttributes(petList);
		
		return USER_JSP;
	}
	
	@RequestMapping("/pet_registration")
	public String createPet(@RequestParam Pet pet) {
		
		model.addObject("petType", PetType.values());
		return "petRegistration";
	}
	
	

}
