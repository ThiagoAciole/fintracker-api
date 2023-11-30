package com.example.fintracker.filter.model;



import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "transacao")

@Getter

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false,unique = true)
    private long id;

    @Column(name = "user_id",nullable = false)
    private Integer user_id;

    @Column(name = "valor",nullable = false)
    private Float valor;

    @Column(name = "categoria",nullable = true)
    private String categoria;

    @Column(name = "tipo",nullable = true)
    private String tipo;

    @Column(name = "data")
    @Getter
    private Date data;


    public Transaction(Integer user_id, Float valor, String categoria, String tipo, Data data) {
        this.user_id = user_id;
        this.valor = valor;
        this.categoria = categoria;
        this.tipo = tipo;
        //this.data = data;
    }

    public Transaction() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
