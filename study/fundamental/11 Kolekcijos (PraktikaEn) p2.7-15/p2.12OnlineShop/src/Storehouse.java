import java.util.*;

public class Storehouse {
    private Map<String,Integer> prices;
    private Map<String,Integer> stocks;

    public Storehouse() {
        prices= new HashMap<>();
        stocks= new HashMap<>();

    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product,price);
        this.stocks.put(product,stock);
    }
    public int price(String product){
        return prices.getOrDefault(product, -99);
    }
    public int stock(String product){
        return stocks.getOrDefault(product, -99);
    }

    public boolean take(String product){
        if(!stocks.containsKey(product)) return false;
        else
            if(stocks.get(product)>0){
                stocks.computeIfPresent(product,(key,value) -> value-1);
                return true;
            }
            else
                return false;

    }

    public Map<String, Integer> getStocks() {
        return stocks;
    }

    public Set<String> products() {
        return (prices.keySet());

    }
}
