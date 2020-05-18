import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCartModificationException;
import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingItem;

import java.util.Collection;

public class LockedCart extends ShoppingCartDecorator {

    public LockedCart(ShoppingCart cart) {
        super(cart);
    }

    @Override
    public void addShoppingItem(ShoppingItem shoppingItem) {
        throw new ShoppingCartModificationException();
    }

    @Override
    public void removeShoppingItem(ShoppingItem shoppingItem) {
        throw new ShoppingCartModificationException();
    }

    @Override
    public void clearShoppingCart() {
        throw new ShoppingCartModificationException();
    }

}
