package com.example.fintracker.filter.managers;

import com.example.fintracker.filter.model.User;

import java.util.Date;

public class UserManager {

    private static final UserManager instance = new UserManager();


    private UserManager() {

    }


    public static UserManager getInstance() {
        return instance;
    }

    public User createUser(String username, String email, String password, String cpf, Date dateOfBirth) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setCpf(cpf);
        newUser.setDateOfBirth(dateOfBirth);
        return newUser;
    }


}