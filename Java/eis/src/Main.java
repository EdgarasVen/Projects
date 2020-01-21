public class Main {
    public static void main(String[] args) {
        CurrencyInformer currencyInformer =new CurrencyInformer(
                new CurrencyExternalProvider()
        );
        String currencyInfo = currencyInformer.inform(
                new CurrencyParameters(
                        "eu",
                        "USD",
                        "2015-12-25",
                        "2020-01-01"
                )
        );
        System.out.println(currencyInfo);
    }
}
