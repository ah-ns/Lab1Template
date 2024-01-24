/*

Programmers: Michele Onton & Hans Van Lierop
Course: CS212, Mr. John
Due Date: 1/28/23
Lab Assignment: 1
Problem Statement: You are going to write a program to provide you with a receipt for your shopping trip.
Data In: name of the items, number of units, cost per unit
Data Out: final total for each item the user purchased
Credits:

 */


import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Thank you for visiting M and H grocery store!");
        System.out.println("Enter the first item you purchased? ");
        String item1 = input.nextLine();
        System.out.println(item1);
        System.out.println("How many units of " + item1 + " did you buy? ");
        int item1quantity = input.nextInt();
        System.out.println(item1quantity);
        System.out.println("Enter the cost per unit: ");
        double item1cost = input.nextDouble();
        System.out.println(item1cost);

        System.out.println("Enter the second item you purchased? ");
        String item2 = input.next();
        System.out.println(item2);
        System.out.println("How many units of " + item2 + " did you buy? ");
        int item2quantity = input.nextInt();
        System.out.println(item2quantity);
        System.out.println("Enter the cost per unit: ");
        double item2cost = input.nextDouble();
        System.out.println(item1cost);

        // Calculate the total for the first item
        double item1total = item1quantity * item1cost;
        // Calculate the total for the second item
        double item2total = item2quantity * item2cost;
        // Add both totals
        double final_total = item1total + item2total;

        // Print final total
        System.out.println("Thank you for shopping. Here is your receipt....");
        System.out.println(item1 + " " + item1quantity + " @ " + item1cost + " " + item1total);
        System.out.println(item2 + " " + item2quantity + " @ " + item2cost + " " + item2total);
        System.out.println("TOTAL: " + "$" +final_total);
        System.out.println("Thanks for your visit. Have a nice day");


    }
}