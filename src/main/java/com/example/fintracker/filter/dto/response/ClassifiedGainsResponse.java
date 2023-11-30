package com.example.fintracker.filter.dto.response;

import com.example.fintracker.filter.model.Transaction;

import java.util.List;

public  class ClassifiedGainsResponse {
    private final List<Transaction> classifiedGains;
    private final double sumOfGains;

    public ClassifiedGainsResponse(List<Transaction> classifiedGains, double sumOfGains) {
        this.classifiedGains = classifiedGains;
        this.sumOfGains = sumOfGains;
    }

    public List<Transaction> getClassifiedGains() {
        return classifiedGains;
    }

    public double getSumOfGains() {
        return sumOfGains;
    }
}