package com.trishivax.javarevision;

public class Admin {
    static void main(String[] args) {
        Helper hp = new Helper();
        System.out.println(hp.getBankBalance());
    }
}

//Concept of Getter and Setters
//a private variable can become public with its methods forms
//to make the private information very secure we should also take care of
//its getters and setters

class Helper{
    private  int bankBalance = 100000;

    public int getBankBalance() {
        return bankBalance;
    }

    /*public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }*/
}