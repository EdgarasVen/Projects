import java.util.ArrayList;

public interface CurrencyProvider {

    ArrayList<String> provide(CurrencyParameters parameters);
}
