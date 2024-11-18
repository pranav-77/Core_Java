package com.pranav.java8FeaturesProblems.problem4;

import java.time.LocalDate;

public class ClaimAnalysis {
    private String claimId;
    private String policyNumber;
    private double claimAmount;
    private LocalDate claimDate;
    private String claimStatus;

    public ClaimAnalysis(String claimId, String policyNumber, double claimAmount, LocalDate claimDate, String claimStatus) {
        this.claimId = claimId;
        this.policyNumber = policyNumber;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.claimStatus = claimStatus;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    @Override
    public String toString() {
        return "Claim ID: " + claimId + "\n" + "Policy Number: " + policyNumber + "\n" + "Claim Amount: " + claimAmount + "\n" + "Claim Date: " + claimDate + "\n" + "Claim Status: " + claimStatus + "\n";
    }
}
