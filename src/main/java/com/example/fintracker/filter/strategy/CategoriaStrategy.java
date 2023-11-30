package com.example.fintracker.filter.strategy;

import com.example.fintracker.filter.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class CategoriaStrategy {

    public static SeparatedTransactions separarPorCategoria(List<Transaction> transactions) {
        List<Transaction> ganhos = new ArrayList<>();
        List<Transaction> gastos = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if ("ganho".equalsIgnoreCase(transaction.getCategoria())) {
                ganhos.add(transaction);
            } else if ("gasto".equalsIgnoreCase(transaction.getCategoria())) {
                gastos.add(transaction);
            }
            // Pode adicionar mais condições para outras categorias, se necessário
        }

        return new SeparatedTransactions(ganhos, gastos);
    }

    public static class SeparatedTransactions {
        private final List<Transaction> ganhos;
        private final List<Transaction> gastos;

        public SeparatedTransactions(List<Transaction> ganhos, List<Transaction> gastos) {
            this.ganhos = ganhos;
            this.gastos = gastos;
        }

        public List<Transaction> getGanhos() {
            return ganhos;
        }

        public List<Transaction> getGastos() {
            return gastos;
        }
    }
}
