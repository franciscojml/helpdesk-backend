package com.fjlima.helpdesk;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.fjlima.helpdesk.api.entity.User;
import com.fjlima.helpdesk.api.enums.ProfileEnum;
import com.fjlima.helpdesk.api.repository.UserRepository;

@SpringBootApplication
public class HelpDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpDeskApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};
	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User admin = new User(null, "admin@heldesk.com", passwordEncoder.encode("123456"), ProfileEnum.ROLE_ADMIN);

		User find = userRepository.findByEmail("admin@heldesk.com");
		if (find == null) {
			userRepository.save(admin);
		}
	}

}
