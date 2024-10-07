package com.kamaathedj.SunnyDay;

import com.kamaathedj.SunnyDay.model.User;
import com.kamaathedj.SunnyDay.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SunnyDayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunnyDayApplication.class, args);
	}


//	@Bean
//	ApplicationListener<MyEvent> readyListener(){
//		return event -> {
//			System.out.println(event.getMessage());
//		};
//	}


	@Bean
	ApplicationListener<ApplicationReadyEvent> readyListener2(UserRepository userRepository, PasswordEncoder encoder){
		return event -> {
			userRepository.save(new User("kamaa", encoder.encode("1234"), true));
			userRepository.save(new User("david", encoder.encode("1234"), false));
		};
	}
}
