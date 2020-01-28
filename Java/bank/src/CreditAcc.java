import ibank.Account;

import java.math.BigDecimal;
import java.util.Random;

public class CreditAcc implements Account {
    private String holderName;
    private String uniqueNumber;
    private BigDecimal creditLimit;
    private BigDecimal balance;

    public CreditAcc(String holderName, BigDecimal limit) {
        this.holderName = holderName;
        this.uniqueNumber = createUniqueNumber();
        creditLimit= BigDecimal.valueOf(0 - limit.doubleValue());
        balance=new BigDecimal(0);
    }
    private String createUniqueNumber (){
        int aStart=1000000;
        int aEnd=99999999;
        Random aRandom = new Random();
        if ( aStart > aEnd ) {
            throw new IllegalArgumentException("Start cannot exceed End.");
        }
        //get the range, casting to long to avoid overflow problems
        long range = (long)aEnd - (long)aStart + 1;
        // compute a fraction of the range, 0 <= frac < range
        long fraction = (long)(range * aRandom.nextDouble());
        int randomNumber =  (int)(fraction + aStart);
        return Integer.toString(randomNumber);
    }
    @Override
    public String getNumber() {
        return uniqueNumber;
    }

    @Override
    public String getHolderName() {
        return holderName;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public boolean deposit(BigDecimal bigDecimal) {
        balance=balance.add(bigDecimal);
        return true;
    }

    @Override
    public boolean withdraw(BigDecimal bigDecimal) {
        if (balance.subtract(bigDecimal).compareTo(creditLimit)>=0) {
            balance = balance.subtract(bigDecimal);
            return true;
        }
        else return false;
    }
}
