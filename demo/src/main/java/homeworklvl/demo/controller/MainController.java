package homeworklvl.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import homeworklvl.demo.repository.UserRepository;

@Controller
@RequestMapping("/main")
public class MainController {

	UserRepository userRepository;

	@RequestMapping
	public String homePage(Model model) {

//		User user = new User();
//		user.setLogin("ponas");
//		user.setEmail("tomas@gmail.com");
//		user.setPassword("ponas");
//		
//		userRepository.save(user);
//		
//		User admin = new User();
//		admin.setLogin("admin");
//		admin.setEmail("admin@admin.com");
//		admin.setPassword("admin");
//		admin.setRole(Role.ADMIN);
//		admin.setStatus(Status.ACTIVE);
//		
//		userRepository.save(admin);
		
		
		return "homePage";
	}

}
