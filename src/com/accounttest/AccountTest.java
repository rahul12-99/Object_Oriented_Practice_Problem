package com.accounttest;

import java.util.Scanner;

/**
 * This class is for doing the operation with account balance
 */

public class AccountTest {
    static Account account = new Account();

    /**
     * This method is for add the balance and check balance and also withdraw the balance
     */
    public static void toCheck() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Amount in AccountTest.Account - ");
        account.setBalance(input.nextInt());
        String choice = "yes";
        while (!choice.equals("no")){
            System.out.print("Enter the amount you want to withdraw - ");
            int withdraw = input.nextInt();
            if (account.getBalance() >= withdraw) {
                account.debit(withdraw);
            } else
                System.out.println("\nDebit amount exceeded account balance. ");

            System.out.print("\nBalance left in account = " +account.getBalance() +"\n");

            System.out.print("Do you want to withdraw more ? (yes/no)  ");
            choice = input.next();
        }
    }

    /**
     * This is main method of program to call the to check method and also the finalBalance method
     */
    public static void main(String[] args) {
        toCheck();
        account.finalBalance();
    }
}
