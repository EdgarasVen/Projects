package com.company;

import java.util.Collection;

public interface CurrencyProvider {

    Collection<CurrencyInfo> provide(String cur1, String cur2, DateRange range);

}
