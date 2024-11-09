package com.pranav.java8FeaturesProblems.problem5;

public class RiskAssessment {
    private int id;
    private String name;
    private double riskScore;

    public RiskAssessment(int id, String name, double riskScore) {
        this.id = id;
        this.name = name;
        this.riskScore = riskScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRiskScore() {
        return riskScore;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "RiskScore: " + riskScore + "\n";
    }
}
