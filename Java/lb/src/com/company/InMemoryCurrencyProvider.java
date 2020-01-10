package com.company;

import java.util.Collection;

public class InMemoryCurrencyProvider implements CurrencyProvider{

    private Collection<CurrencyInfo> db;

    public InMemoryCurrencyProvider(Collection<CurrencyInfo> db) {
        this.db = db;
    }


    @Override
    public String provide(String type,String cur, DateRange range) {
        return new ExternalCurrencyProvider().provide(type,cur,range);
    }
}
