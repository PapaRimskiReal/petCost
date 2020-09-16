package homeworklvl.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import homeworklvl.demo.domain.modelUser.User;
import homeworklvl.demo.repository.UserRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@Autowired
    PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping()
	public String getNewUser(@ModelAttribute("user") User user) {

		return "registration";
	}

	@PostMapping()
	public String postNewUser(@ModelAttribute("user") User user) {

//		user.setPassword(passwordEncoder.encode(user.getPassword()));
		String password = passwordEncoder.encode(user.getPassword());
		user.setPassword(password);
		userRepository.save(user);

		return "redirect:/main";
	}
}
