package com.example.schoolmngtback;

import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.bean.Roles;
import com.example.schoolmngtback.implementation.AdminImpl;
import com.example.schoolmngtback.repo.AdministratorRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.time.LocalDate;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@EnableJpaRepositories(basePackageClasses = AdministratorRepo.class)
public class SchoolmngtbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolmngtbackApplication.class, args);
	}

	@Bean
	CommandLineRunner start(AdminImpl admin){
		return args -> {
			admin.create(new Administrator("Abdoulaye","sall","gallebaba@gmail.com","passer", LocalDate.now(),"keurmassar",true, Roles.ADMINISTRATOR));
			admin.create(new Administrator("Baba","Baba","gallebaba@gmail.com","passer", LocalDate.now(),"keurmassar",true, Roles.INSTRUCTOR));
			admin.create(new Administrator("House","Galle","gallebaba@gmail.com","passer", LocalDate.now(),"keurmassar",true, Roles.INSTRUCTOR));
		};
	}

}
