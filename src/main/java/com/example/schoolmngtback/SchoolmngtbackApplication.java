package com.example.schoolmngtback;
import com.example.schoolmngtback.bean.User;
import com.example.schoolmngtback.implementation.AdminImpl;
import com.example.schoolmngtback.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SchoolmngtbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmngtbackApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
	@Bean
	CommandLineRunner start(AdminImpl admin){
		return args -> {
			/*admin.create(new User("Abdoulaye","sall",true,"ROLE_USER"));
			admin.create(new User("sall","house",true,"ROLE_ADMINISTRATOR"));
			admin.create(new User("Baba","galle",true,"ROLE_INSTRUCTOR"));*/
		};
	}

}
