package com.pranav.java8FeaturesProblems.problem6;

import java.time.LocalDate;

public class FraudDetection {
    private int transactionId;
    private String policyNumber;
    private double amount;
    private LocalDate transactionDate;
    private boolean isFraudulent;

    public FraudDetection(int transactionId, String policyNumber, double amount, LocalDate transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    @Override
    public String toString() {
        return "Transaction id: " + transactionId + "\n" +
                "Policy Number: " + policyNumber + "\n" +
                "Amount: " + amount + "\n" +
                "isFraudulent: " + isFraudulent + "\n";
    }
}
