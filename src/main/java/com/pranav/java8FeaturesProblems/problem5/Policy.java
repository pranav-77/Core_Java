package com.pranav.java8FeaturesProblems.problem5;

public class Policy {
    private int id;
    private String name;
    private int age;
    private String policyType;
    private double premiumAmount;

    public Policy(int id, String name, int age, String policyType, double premiumAmount) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.policyType = policyType;
        this.premiumAmount = premiumAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Holder ID: " + id + "\n" +
                "Age: " + age + "\n" +
                "Name: " + name + "\n" +
                "Policy Type: " + policyType + "\n" +
                "Premium Amount: " + premiumAmount + "\n";
    }
}
