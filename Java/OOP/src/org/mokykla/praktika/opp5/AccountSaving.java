package org.mokykla.praktika.opp5;

public class AccountSaving extends Account {


    public AccountSaving (String name,int id){
        super(name,id);
    }
    public AccountSaving (String name,int id,double balance,double annualInterestRate){
        super(name,id,balance,annualInterestRate);
    }

}
