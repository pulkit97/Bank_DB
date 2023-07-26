package com.qa;

public class Current extends Account  {

    public Current(String accountNumber, String accountHolder, double interestRate, double accountBalance) {
        super(accountNumber, accountHolder, interestRate, accountBalance);
    }

    public double deductBankFee() {
        double accountBal;
        accountBal = getAccountBalance();
        setAccountBalance(accountBal - accountBal * 0.001);
        return getAccountBalance();
    }
}
