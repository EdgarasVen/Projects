package lambda2;

public class Car {
    private int price;

    @Override
    public String toString() {
        return price+"";
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
