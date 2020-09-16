package homeworklvl.demo.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import homeworklvl.demo.domain.modelUser.User;
import homeworklvl.demo.repository.UserRepository;

@EnableWebSecurity
public class SecurityCfg extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserRepository userRepository;

	@Bean
	protected PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/registration");
//	}

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        	http
        		.csrf().disable()
        		.authorizeRequests()
					.antMatchers("/auth/**").permitAll()
					.antMatchers("/main/**").permitAll()
					.antMatchers("/registration/**").permitAll()
					.antMatchers("/admin/**").hasRole("ADMIN")
					.antMatchers("/user/**").hasRole("USER")
//					.and()
//					.rememberMe()
					.and()
				.formLogin()
					.loginPage("/auth/login")
					.failureUrl("/login?error")
					.permitAll()
					.and()
				.logout()
					.invalidateHttpSession(true)
					.clearAuthentication(true)
					.logoutSuccessUrl("/registration")
					.deleteCookies("JSESSIONID");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		String code = passwordEncoder().encode("admin");
		
		auth
			.inMemoryAuthentication()
			.withUser("admin")
			.password(code)
			.roles("ADMIN");
		
		List<User> allUsers = userRepository.findAll();

		allUsers.forEach(user -> {
			if (user.getRole().equals("USER")) {
				try {
					auth
						.inMemoryAuthentication()
						.withUser(user.getUsername())
						
						.password(user.getPassword())
						.roles("USER");
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
	}

}
