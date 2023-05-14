package com.stockaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is for manage the stock portfolio
 */

public class StockPortfolio {

    /**
     * Initialize the scanner class for taking user input
     * Initialize the stock class object and using arraylist for adding the stock details
     */
    static Scanner sc = new Scanner(System.in);
    static Stock stockClass = new Stock();
    static ArrayList<Stock> arrayList = new ArrayList<>();

    /**
     * This method is for add the stock share
     */
    public static void toAdd() {
        for (int i = 1; i <= stockClass.getNumOfShare(); i++) {
            Stock stock = new Stock();
            System.out.print("Enter the price of " + i + " share - ");
            stock.setSharePrice(sc.nextInt());
            arrayList.add(stock);
            stockClass.setTotalPrice(stockClass.getTotalPrice() + stock.getSharePrice());

        }
    }

    /**
     * This method is for print the stock each-share price and total share price
     */
    public static void toPrint() {
        System.out.print("Each share price = \n");
        for (int i = 0; i < stockClass.getNumOfShare(); i++) {
            System.out.print(arrayList.get(i).getSharePrice() + " ");
        }
        System.out.println("\nTotal share price = " + stockClass.getTotalPrice());
    }

    /**
     * This is main method for calling the add and print method and printing the details
     */
    public static void main(String[] args) {

        System.out.println("Enter the name of Stock -");
        stockClass.setStockName(sc.next());
        System.out.println("Enter Num of Shares - ");
        stockClass.setNumOfShare(sc.nextInt());

        toAdd();
        toPrint();

    }
}
