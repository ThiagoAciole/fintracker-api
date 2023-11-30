package com.example.fintracker.filter.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;

@Table(name = "users")
@Entity


public class User {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "email")
    @Getter
    private String email;
    @Column(name = "password")
    @Getter
    private String password;
    @Column(name = "username")
    @Getter
    private String username;
    @Column(name = "cpf")
    @Getter
    private String cpf;
    @Column(name = "date_of_birth")
    @Getter
    private Date dateOfBirth;


    public User() {

    }

    public User(String email, String username, String password, String cpf, Date dateOfBirth) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.cpf = cpf;
        this.dateOfBirth = dateOfBirth;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}