package com.accounttest;

/**
 * This class is for account
 */
public class Account {
    /**
     * Initialize the balance and use getter setter method for get and set the balance
     * Declared debit method for debit the balance and final-balance for show the balance after debit
     */
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int withdraw) {
        balance -= withdraw;
    }
    public void finalBalance(){
        System.out.println("Final Balance left = " +getBalance());
    }
}
