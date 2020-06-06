public class HttpUrlBuilder {
    public String build(CurrencyParameters parameters) {
        return "http://www.lb.lt/webservices/fxrates/FxRates.asmx/getFxRatesForCurrency"
                +"?tp="+parameters.type+"&ccy="+parameters.cur+"&dtFrom="+parameters.from+"&dtTo="+parameters.to;
    }
}
