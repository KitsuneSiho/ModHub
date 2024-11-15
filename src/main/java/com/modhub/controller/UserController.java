package com.modhub.controller;

import com.modhub.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        // 예시 데이터 반환
        return Arrays.asList(
                new User(1L, "John Doe"),
                new User(2L, "Jane Smith"),
                new User(3L, "Bob Johnson")
        );
    }
}
