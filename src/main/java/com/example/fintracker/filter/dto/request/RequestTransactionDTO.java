package com.example.fintracker.filter.dto.request;

import com.example.fintracker.filter.model.Transaction;
import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
@Getter
@Setter
public class RequestTransactionDTO {

    private Integer user_id;
    private Float valor;
    private String categoria;
    private String tipo;
    private Data data;


}
