package com.example.fintracker.filter.dto.response;

import com.example.fintracker.filter.model.Transaction;
import lombok.Getter;

import javax.xml.crypto.Data;
@Getter
public class TransactionResponseDTO {
    private long id;
    private Integer user_id;
    private Float valor;
    private String categoria;
    private String tipo;
    private Data data;

    public TransactionResponseDTO(Transaction transaction){
        this.id = transaction.getId();
        this.categoria = transaction.getCategoria();
        this.tipo = transaction.getTipo();
        //this.data = transaction.getData();
        this.valor = transaction.getValor();
        this.user_id = transaction.getUser_id();
    }
}
