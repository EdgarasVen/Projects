import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

import java.util.Collection;

public class ShoppingCartDecorator implements ShoppingCart {

    ShoppingCart cart;

    public ShoppingCartDecorator(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        cart.addShoppingItem(shoppingItem);
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        cart.removeShoppingItem(shoppingItem);
    }

    @Override
    public void clearShoppingCart() {
        cart.clearShoppingCart();
    }

    @Override
    public Collection<ShoppingItem> getShoppingCartItems() {
        return cart.getShoppingCartItems();
    }

    @Override
    public double calculateTotalPrice() {
        return cart.calculateTotalPrice();
    }
}
