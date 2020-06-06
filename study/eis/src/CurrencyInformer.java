import java.util.ArrayList;

public class CurrencyInformer {

    private CurrencyProvider currencyProvider;

    public CurrencyInformer(CurrencyProvider currencyProvider){
        this.currencyProvider=currencyProvider;
    }

    public String inform(CurrencyParameters parameters){
        ArrayList<String> list =currencyProvider.provide(parameters);
        return list.get(0)+"\n"+list.get(list.size()-1);
    }
}
