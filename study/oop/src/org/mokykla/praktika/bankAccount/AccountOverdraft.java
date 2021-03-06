package org.mokykla.praktika.bankAccount;

public class AccountOverdraft extends Account {


    public AccountOverdraft (String name,int id){
        super(name,id);
    }
    public AccountOverdraft (String name,int id,double balance,double annualInterestRate,double overdraft){
        super(name,id,balance,annualInterestRate);
        super.setOverdraftLimit(overdraft);
    }

    @Override
    public void withdraw(int number,String description) {
        if (super.getBalance()+super.getOverdraftLimit()>=number)
           super.withdraw(number,description);
    }

    @Override
    public String toString() {
        return super.toString()+"overdraft is : "+getOverdraftLimit();
    }
}
