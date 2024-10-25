package com.pranav.oop;

public class Bank {
    private String accountholder;
    private int bal;

    public Bank(String accountholder,int bal) {
        this.accountholder = accountholder;
        this.bal=bal;
    }

    public String getAccountholder() {
        return accountholder;
    }

    public void setAccountholder(String accountholder) {
        this.accountholder = accountholder;
    }

    public int getBal() {
        return this.bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public void Deposit(int amnt){
        if(amnt>0){
            System.out.println(amnt+" deposited successfully");
            setBal(amnt);
            System.out.println("Balance: "+getBal());
        }else{
            System.out.println("provide amount more than 0");
        }
    }

    public void Withdrawal(int amnt){
        if (amnt>0&&amnt<this.bal){
            System.out.println("Withdrawn Successfully");
            this.bal=this.bal-amnt;
            System.out.println("Balance: "+this.bal);
        }else{
            System.out.println("Invalid amount");
        }
    }

}
