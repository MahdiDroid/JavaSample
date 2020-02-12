package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
   private  ArrayList<Branch> branches ;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean AddBranch (String branchName){
        if(findBranch(branchName) != null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;

    }
    public boolean AddCustomer (String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.NewCustomer(customerName,initialAmount);

            }
        return false;
        }


    private Branch findBranch (String branchName){
        for(int i=0; i<this.branches.size();i++){
            if (this.branches.get(i).equals(branchName)){
                return this.branches.get(i);
            }
        } 
        return null;

    }
}
