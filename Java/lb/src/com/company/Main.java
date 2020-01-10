package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args)  {
        // write your code here

        CurrencyInformer currencyInformer = new CurrencyInformer(
                new InMemoryCurrencyProvider(Collections.emptyList())
        );
        String cTable = currencyInformer.inform(
                "eu",
                "USD",
                "2020-01-01",
                "2020-01-01"
        );
        System.out.println(cTable);
    }
}
