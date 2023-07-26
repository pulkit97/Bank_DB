package com.qa;

public class Savings extends Account {
    public Savings(String accountNumber, String accountHolder, double interestRate, double accountBalance) {
        super(accountNumber, accountHolder, interestRate, accountBalance);
    }

    public double addInterest(){
        double accountBal;
        accountBal = getAccountBalance();
        setAccountBalance(accountBal + accountBal * getInterestRate());
        return getAccountBalance();
    }

    public boolean approveLoan() {
        if (getAccountBalance() > 10000) {
            return true;
        }
        else {
            return false;
        }
    }




}
