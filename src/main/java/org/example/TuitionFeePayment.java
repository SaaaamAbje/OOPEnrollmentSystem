package org.example;

public class TuitionFeePayment {

    private final double pricePerUnit = 1000.00;
    private double balance;

    public double calculateTuitionFee(int units) {
        balance = units * pricePerUnit;
        return balance;
    }

    public double calculateBalance() {
        return balance;
    }
}
