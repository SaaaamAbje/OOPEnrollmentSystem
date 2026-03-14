package org.example;

public class TuitionFeePayment {

    private final double pricePerUnit = 1000.00;
    private double balance;
    private double totalTuition;

    public double calculateTuitionFee(int units, double discountRate) {

        totalTuition = units * pricePerUnit;

        if (discountRate != 0) {
            totalTuition = totalTuition - (totalTuition * discountRate);
        }


        this.balance = totalTuition;
        return totalTuition;
    }

    public void makePayment(double amount) {

        balance = balance - amount;
        System.out.println("Payment of " + amount + " received.");
    }

    public double getRemainingBalance() {
        return balance;
    }


}




















