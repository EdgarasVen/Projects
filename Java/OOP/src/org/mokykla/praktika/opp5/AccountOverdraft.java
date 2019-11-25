package org.mokykla.praktika.opp5;

public class AccountOverdraft extends Account {


    public AccountOverdraft (String name,int id){
        super(name,id);
    }
    public AccountOverdraft (String name,int id,double balance,double annualInterestRate,double overdraft){
        super(name,id,balance,annualInterestRate);
        super.setOverdraftLimit(overdraft);
    }

    @Override
    public void withdraw(int number) {
        if (super.getBalance()+super.getOverdraftLimit()>=number)
           setBalance(getBalance()-number);
    }

    @Override
    public String toString() {
        return super.toString()+"overdraft is : "+getOverdraftLimit();
    }
}
