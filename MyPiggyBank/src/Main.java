package com.learning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Create a new PiggyBank object with the owner name "น้องพอใจ"
        PiggyBank piggy = new PiggyBank("น้องพอใจ");

        // Show the current money in the piggy bank (initially 0.0)
        piggy.showMoney();

        // Loop to allow the user to add money or exit
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add money to the piggy bank");
            System.out.println("2. Show current money in the piggy bank");
            System.out.println("3. Exit");

            // Get the user's choice
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Ask the user how much money to add
                    System.out.print("Enter the amount of money to add (in bath): ");
                    double amount = scanner.nextDouble();
                    piggy.addMoney(amount); // Add money to the piggy bank
                    break;

                case 2:
                    // Show the current money in the piggy bank
                    piggy.showMoney();
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    // Invalid input handling
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
