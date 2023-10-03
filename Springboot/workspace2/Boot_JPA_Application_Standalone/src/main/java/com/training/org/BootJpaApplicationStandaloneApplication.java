package com.training.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.training.org.dao.UserRepository;
import com.training.org.entity.User;

@SpringBootApplication
public class BootJpaApplicationStandaloneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootJpaApplicationStandaloneApplication.class, args);
		//ApplicationContext context= SpringApplication.run(BootJpaApplicationStandaloneApplication.class, args);
        UserRepository userRepository = run.getBean(UserRepository.class);	
         
        User user =new User();
        user.setName("Amrita Karki");
        user.setCity("Bilaspur");
        user.setStatus("I am a Java Developer");
        
        User user1 = userRepository.save(user);
        System.out.println(user1);
	}

}
