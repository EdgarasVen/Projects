import ibank.Account;
import ibank.Bank;

import java.math.BigDecimal;
import java.util.*;

public class MyBank implements Bank {
    List<Account> accountSet = new ArrayList<>();

    @Override
    public int getNumberOfAccounts() {
        return accountSet.size();
    }

    @Override
    public BigDecimal getTotalReserves() {
        return accountSet.stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Collection<Account> getAllAccounts() {
        return accountSet;
    }

    @Override
    public Account openDebitAccount(String s) {
        if (getAccountByHolderName(s)==null){
        accountSet.add(new DebitAcc(s));
        return accountSet.get(accountSet.size()-1);
        }
        else return null;
    }

    @Override
    public Account openCreditAccount(String s, BigDecimal bigDecimal) {
        if (getAccountByHolderName(s)==null) {
            accountSet.add(new CreditAcc(s, bigDecimal));
            return accountSet.get(accountSet.size() - 1);
        }
        else return null;
    }

    @Override
    public Account getAccountByHolderName(String s) {
        return accountSet.stream()
                .filter(account -> account.getHolderName().equals(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public Account getAccountByNumber(String s) {
        return accountSet.stream()
                .filter(account -> account.getNumber().equals(s))
                .findAny()
                .orElse(null);
    }

    @Override
    public void closeAccount(Account account) {
        accountSet.remove(account);
    }
}
