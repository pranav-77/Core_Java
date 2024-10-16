package com.pranav.encapsulation;

public class AccountHolder {
    public static void main(String[] args) {
        Bank user1 = new Bank(4565, 99786754, 50000, "IFSC8890");
        Bank user2 = new Bank(2345, 45678894, 40000, "IFSC8891");

        user1.setAtm_pin(4532);
        user1.display();
        System.out.println();
        user2.display();
    }
}
