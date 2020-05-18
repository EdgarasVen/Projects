import lt.infobalt.itakademija.javalang.exam.shopingcart.ShoppingCart;
import lt.infobalt.itakademija.javalang.exam.shoppingcart.BaseShoppingCartDecoratorTest;

public class Test extends BaseShoppingCartDecoratorTest {

    protected ShoppingCart getDecoratedShoppingCart(ShoppingCart shoppingCart, double v, double v1) {
        return new LockedCart(new DiscountCart(new TaxedCart(shoppingCart,v1),v));
    }

    protected ShoppingCart getDiscountAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new DiscountCart(shoppingCart,v);
    }

    protected ShoppingCart getTaxAppliedShoppingCart(ShoppingCart shoppingCart, double v) {
        return new TaxedCart(shoppingCart,v);
    }

    protected ShoppingCart getLockedFromModificationShoppingCart(ShoppingCart shoppingCart) {
        return new LockedCart(shoppingCart);
    }
}
