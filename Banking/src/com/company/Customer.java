package com.company;

import java.util.ArrayList;

public class Customer {

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    private String name ;
    private ArrayList<Double> transactions ;

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

}
