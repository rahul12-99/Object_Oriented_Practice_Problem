package com.commercialdata;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount implements Company{
    /**
     * Initialize the scanner and array
     */
    static Scanner input = new Scanner(System.in);
    static ArrayList<Company> array = new ArrayList<>();
    static int valueOfShare;

    /**
     * This method is for buying the shares
     */
    @Override
    public void buy() {
        System.out.print("Enter num of shares you want to buy - ");
        int numToBuy = input.nextInt();
        System.out.print("Enter value of each share - ");
        int valueToBuy = input.nextInt();
        int totalShareAmtBuy = numToBuy * valueToBuy;
        valueOfShare += totalShareAmtBuy;
        System.out.println("Value of share = " + valueOfShare);

    }

    /**
     * This method is for selling the shares
     */
    @Override
    public void sell() {
        System.out.print("Enter num of shares you want to sell - ");
        int numToSell = input.nextInt();
        System.out.print("Enter value of each share - ");
        int valueToSell = input.nextInt();
        int totalShareAmtSell = numToSell * valueToSell;
        valueOfShare -= totalShareAmtSell;
        System.out.println("Value of share = " + valueOfShare);

    }

    /**
     * This is the save method to save the shares with current time and date
     */
    @Override
    public void save() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Time saved = " + date + " " + time);

    }

    /**
     * This method is for printing the report of shares
     */
    @Override
    public void printReport() {
        for (Company company : array) {
            System.out.println(company);

        }
    }

    /**
     * This is main method to call the all method and printing
     */
    public static void main(String[] args) {
        System.out.print("Enter value of share in account - ");
        valueOfShare = input.nextInt();
        Company obj = new StockAccount();
        String choice = "Continue";
        while (!choice.equals("print")) {
            System.out.println("What do you want to perform for Shares ");
            System.out.print("Buy / Sell / Save / Print - ");
            choice = input.next();
            switch (choice) {
                case "buy":
                    obj.buy();
                    break;
                case "sell":
                    obj.sell();
                    break;
                case "save":
                    obj.save();
                    break;
                case "print":
                    obj.printReport();
                    break;
            }
            array.add(obj);
        }
    }

}
