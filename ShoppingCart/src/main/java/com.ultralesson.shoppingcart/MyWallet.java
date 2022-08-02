package com.ultralesson.shoppingcart;

public class MyWallet {
    private double balance;

    public MyWallet(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
