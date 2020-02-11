package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private  ArrayList<Customer> Customers;

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.Customers=new ArrayList<Customer>();
    }



    public boolean NewCustomer (String customerName, double initialAmount){
        if(FindCustomer(customerName) == null) {
            this.Customers.add(new Customer(customerName,initialAmount));
            return true;
            }
        return false;
        }
    public boolean AddCustomerTransaction(String customerName,double amount){
        Customer existingCustomer = FindCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
        }
        return false;
    }
    private Customer FindCustomer(String customerName){
        for(int i=0; i<this.Customers.size();i++){
            if (this.Customers.get(i).equals(customerName)){
                return this.Customers.get(i);
            }
        }
        return null;
    }



}

