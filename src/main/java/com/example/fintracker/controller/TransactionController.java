package com.example.fintracker.controller;


import com.example.fintracker.filter.model.Transaction;

import com.example.fintracker.service.transaction.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {

    private final TransactionService transactionService;


    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;

    }
    @GetMapping("/")
    public ResponseEntity<List<Transaction>> getAllTransactions() {
        List<Transaction> transactions = transactionService.getAllTransactions();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
    @PostMapping("/register")
    public ResponseEntity<Transaction> registerTransaction(@RequestBody Transaction transaction) {
        Transaction newTransaction = transactionService.registerTransaction(
                transaction.getTipo(),
                transaction.getValor(),
                transaction.getUser_id(),
                transaction.getCategoria(),
                transaction.getData()
        );
        return new ResponseEntity<>(newTransaction, HttpStatus.CREATED);

    }

    @GetMapping("/byUserId/{userId}")
    public ResponseEntity<List<Transaction>> getTransactionByUserId(@PathVariable int userId) {
        List<Transaction> transactions = transactionService.getAllTransactions();

        List<Transaction> transactionsByUser = new ArrayList<>();
        for(int i = 0;i<transactions.size();i++){
           if(transactions.get(i).getUser_id() == userId ){
               transactionsByUser.add(transactions.get(i));
           }
        }


        return new ResponseEntity<>(transactionsByUser, HttpStatus.OK);
    }


}
