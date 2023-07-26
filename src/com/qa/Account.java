package com.qa;

public class Account {

    private String accountNumber;
    private String accountHolder;
    private double interestRate;
    private double accountBalance;


    public Account(String accountNumber, String accountHolder, double interestRate, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.interestRate = interestRate;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", interestRate=" + interestRate +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public double deposit(double amount){
        setAccountBalance(getAccountBalance() + amount);
        return getAccountBalance();
    }

    public double withdraw(double amount){
        if (getAccountBalance()-amount < 0) {
            System.out.println("Not enough balance to withdraw !!");
        }
        else{
            setAccountBalance(getAccountBalance() - amount);
        }

        return getAccountBalance();

    }


}
