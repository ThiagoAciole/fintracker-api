package com.example.fintracker.service;


import com.example.fintracker.filter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserService userService;

    @Autowired
    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public boolean authenticate(String email, String password) {
        User user = userService.getUserByEmail(email);
        return user != null && user.getPassword().equals(password);
    }
}
