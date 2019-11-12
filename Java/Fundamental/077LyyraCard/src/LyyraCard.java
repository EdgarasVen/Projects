public class LyyraCard {
    private double balance;

    public LyyraCard(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "LyyraCard{" +
                "balance=" + balance +
                '}';
    }
    public void payEconomical() {
        if (balance<2.5)
            System.out.println("Not enough money");
        else
        balance = balance - 2.5;
    }
    public void payGourmet() {
        if (balance<4.0)
            System.out.println("Not enough money");
        else
            balance = balance - 4.0;
    }

    public void loadMoney(double amount) {
        if (amount<0){
            System.out.println("Loan cant be negative");
            return;
        }
        balance = balance +amount;
        if (balance>150)
            balance =150;
    }
}
