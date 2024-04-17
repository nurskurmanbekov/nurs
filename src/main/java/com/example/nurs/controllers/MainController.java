package com.example.nurs.controllers;

import com.example.nurs.entities.User;
import com.example.nurs.repo.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MainController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
