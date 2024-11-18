package com.pranav.java8FeaturesProblems.problem7;

import java.time.LocalDate;

public class Policy {
    private String policyNumber;
    private String policyHolderId;
    private LocalDate date;
    private double premiumAmount;
    private String status;

    public Policy(String policyNumber, String policyHolderId, LocalDate date, double premiumAmount, String status) {
        this.policyNumber = policyNumber;
        this.policyHolderId = policyHolderId;
        this.date = date;
        this.premiumAmount = premiumAmount;
        this.status = status;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(String policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PolicyNo: " + policyNumber + "\n" +
                "Policy Holder Id: " + policyHolderId + "\n" +
                "Date: " + date + "\n" +
                "Premium Amount: " + premiumAmount + "\n" +
                "status: " + status + "\n";
    }
}
