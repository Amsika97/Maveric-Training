package com.training.org;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.training.org.entity.Course;
import com.training.org.entity.CourseRepository;
import com.training.org.entity.StudentRepository;
import com.training.org.entity.Students;
import com.training.org.entity.User;
import com.training.org.entity.UsersRepository;
@SpringBootApplication 

public class SpringBootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository repository, CourseRepository crepository, UsersRepository urepository) {
		return (args) -> {
			// save students
			repository.save(new Students("Aditi", "Tiwari", "IT", "aditi@gmail.com")); 
			repository.save(new Students("Apurva", "Singh", "IT", "apurva@gmail.com"));
			repository.save(new Students("Eshan", "Sharma", "Mech", "eshan@gmail.com"));
			repository.save(new Students("Kiran", "Singh", "Civil","Kiran@gmail.com"));
			repository.save(new Students("Dimple", "Pandey", "EEE","Dimple@gmail.com"));
			
			Stream.of("Programming Java", "Spring Boot basics", "Python", "Angular").forEach(name -> {
				crepository.save(new Course(name));
			});

			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$08$bCCcGjB03eulCWt3CY0AZew2rVzXFyouUolL5dkL/pBgFkUH9O4J2", "ADMIN");
			urepository.saveAll(Arrays.asList(user1, user2));
		};
	}
}
