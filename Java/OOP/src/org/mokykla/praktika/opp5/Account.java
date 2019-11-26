package org.mokykla.praktika.opp5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class Account {
    private String name;
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date date=null;
    private double overdraftLimit=0;
    private ArrayList<Transaction> transactionsList;

    public Account (String name,int id){
        this.name=name;
        this.id=id;
        date=new Date();
        transactionsList = new ArrayList<Transaction>();
    }
    public Account (String name,int id,double balance,double annualInterestRate){
        this.name=name;
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        date=new Date();
        transactionsList = new ArrayList<Transaction>();
    }
    public String createDate(){
        return new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z").format(System.currentTimeMillis());
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return null;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance*getMonthlyInterestRate();
    }

    public void withdraw(int number,String descriptions){
        if (balance>=number)
            balance-=number;
        transactionsList.add(new Transaction('W',number,balance,descriptions));
    }

    public void add(int number,String descriptions){
        if(number>0)
            balance+=number;
        transactionsList.add(new Transaction('D',number,balance,descriptions));
    }
    public void printAllTransactions(){
        for (Transaction trans: transactionsList) {
            System.out.println(trans);
        }
    }
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated='"  +
                ", overdraftLimit=" + overdraftLimit +
                ", transitions=" +
                '}' ;
    }
}
