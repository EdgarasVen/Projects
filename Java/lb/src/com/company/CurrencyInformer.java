package com.company;

import java.time.LocalDate;
import java.util.Collection;

public class CurrencyInformer {

    // skaciat i parsit
    private CurrencyProvider currencyProvider;


    public CurrencyInformer(CurrencyProvider currencyProvider) {
        this.currencyProvider = currencyProvider;

    }

    public String inform(String type,String currency, String dateFrom, String dateTo) {
        String currencyInfos = currencyProvider.provide(
                type,
                currency,
                new DateRange(LocalDate.parse(dateFrom), LocalDate.parse(dateTo)
                )
        );
        return currencyInfos;
    }

    private String stringify(Collection<CurrencyInfo> currencyInfos) {
        // infos to string
        return "";
    }

}

