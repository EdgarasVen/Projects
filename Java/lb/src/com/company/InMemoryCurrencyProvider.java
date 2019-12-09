package com.company;

import java.util.Collection;

public class InMemoryCurrencyProvider implements CurrencyProvider{

    private Collection<CurrencyInfo> db;

    public InMemoryCurrencyProvider(Collection<CurrencyInfo> db) {
        this.db = db;
    }


    @Override
    public Collection<CurrencyInfo> provide(String cur1, String cur2, DateRange range) {
        return null;
    }
}
