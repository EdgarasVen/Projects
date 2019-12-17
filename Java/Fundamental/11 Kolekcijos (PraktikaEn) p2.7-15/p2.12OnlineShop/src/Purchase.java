public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public void increaseAmount() {
        amount++;
    }

    public String price() {
        return String.valueOf(amount*unitPrice);
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "product='" + product + '\'' +
                ", amount=" + amount +
                '}';
    }
}
