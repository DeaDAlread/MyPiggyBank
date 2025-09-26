package com.learning;

public class PiggyBank {
    // Fields for owner name and money in the piggy bank
    private String ownerName;
    private double money;

    // Constructor that accepts only ownerName and sets money to 0.0
    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0; // Initial money is always 0.0
    }

    // Method to add money to the piggy bank
    public void addMoney(double amount) {
        money += amount; // Add the given amount to the current money
        System.out.println("U drop some in this fat pig. It has owner name " + ownerName + " with amount of " + amount + " bath.");
    }

    // Method to show the current amount of money in the piggy bank
    public void showMoney() {
        System.out.println("This fat pig has owner name " + ownerName + " and got fed in total of " + money + " bath.");
    }
}
