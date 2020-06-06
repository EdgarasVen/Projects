import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
        private Map<String,Purchase> list;

    public ShoppingBasket() {
        list = new HashMap<>();
    }


    public void add(String product, int price) {
        if (list.containsKey(product))
            list.get(product).increaseAmount();
        else
        list.put(product,new Purchase(product,1,price));
    }

    public String price() {
        int sum = 0;
        for (String pur:list.keySet()
             ) {
            sum+=Integer.parseInt(list.get(pur).price());
        }
        return String.valueOf(sum);
    }
    public void print(){
        for (String st:list.keySet()
             ) {
            System.out.println(st+": "+list.get(st).getAmount());
        }
    }
}
