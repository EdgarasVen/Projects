package com.company;

public class UrlBuilder {

    public String BuildUrl(String type,String cur,DateRange range){
        return "http://www.lb.lt/webservices/fxrates/FxRates.asmx/getFxRatesForCurrency"
                +"?tp="+type+"&ccy="+cur+"&dtFrom="+range.from+"&dtTo="+range.to;
    }
}
