package com.example.nurs;

import com.example.nurs.entities.User;
import com.example.nurs.repo.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class NursApplication {


	public static void main(String[] args) {
		SpringApplication.run(NursApplication.class, args);
	}

}
