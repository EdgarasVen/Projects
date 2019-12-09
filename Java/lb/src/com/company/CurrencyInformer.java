package com.company;

import java.time.LocalDate;
import java.util.Collection;

public class CurrencyInformer {

    // skaciat i parsit
    private CurrencyProvider currencyProvider;
    // eur
    private String currency;

    public CurrencyInformer(CurrencyProvider currencyProvider, String currency) {
        this.currencyProvider = currencyProvider;
        this.currency = currency;
    }

    public String inform(String currency2, String dateFrom, String dateTo) {
        Collection<CurrencyInfo> currencyInfos = currencyProvider.provide(
                currency,
                currency2,
                new DateRange(LocalDate.parse(dateFrom), LocalDate.parse(dateTo)
                )
        );
        return stringify(currencyInfos);
    }

    private String stringify(Collection<CurrencyInfo> currencyInfos) {
        // infos to string
        return "";
    }

}

