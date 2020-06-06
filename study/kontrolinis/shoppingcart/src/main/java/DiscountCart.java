import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;

public class DiscountCart extends ShoppingCartDecorator{
    private double discount;

    public DiscountCart(ShoppingCart cart, double discount) {
        super(cart);
        this.discount=discount;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice()* (1.0D - discount);
    }
}
