import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class TaxedCart extends ShoppingCartDecorator{

    private double tax;

    public TaxedCart(ShoppingCart cart, double tax) {
        super(cart);
        this.tax=tax;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice()* (1.0D + tax);
    }
}
