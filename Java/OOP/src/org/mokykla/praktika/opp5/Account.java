package org.mokykla.praktika.opp5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Account {
    private String name;
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private String dateCreated =new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z").format(System.currentTimeMillis());
    private double overdraftLimit=0;
    private ArrayList<String> transitions =new ArrayList<>();

    public Account (String name,int id){
        this.name=name;
        this.id=id;
    }
    public Account (String name,int id,double balance,double annualInterestRate){
        this.name=name;
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
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

    public void setId(int id) {
        this.id = id;
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

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance*getMonthlyInterestRate();
    }

    public void withdraw(int number){
        if (balance>=number)
            balance-=number;
        transitions.add(createDate()+" Type W , amount: " +number+",balance:"+balance);
    }

    public void deposit(int number){
            balance+=number;
        transitions.add(createDate()+" Type D , amount: " +number+",balance:"+balance);

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated='" + dateCreated + '\'' +
                ", overdraftLimit=" + overdraftLimit +
                ", transitions=" + transitions +
                '}';
    }
}
