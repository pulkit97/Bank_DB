package com.qa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Savings s1= new Savings("12345", "Pulkit", 4, 30000);
        Savings s2= new Savings("3453", "Abhinav", 4, 50000);
        Current c1= new Current("42", "Elisa", 4, 35332);
        Current c2= new Current("235", "Cynthia", 4, 53536);

        ArrayList<Account> accounts =  new ArrayList<>();
        accounts.add(s1);
        accounts.add(s2);
        accounts.add(c1);
        accounts.add(c2);

        for(Account acc: accounts){
            acc.deposit(10000);
            acc.withdraw(1000);
        }

        s1.addInterest();
        s2.addInterest();
        System.out.println(s1.approveLoan());

        c1.deductBankFee();

        for(Account acc: accounts){
            System.out.println(acc);;
        }

    }
}