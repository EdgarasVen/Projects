package com.company;

import org.w3c.dom.bootstrap.DOMImplementationRegistry;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CurrencyInformer currencyInformer = new CurrencyInformer(
                new InMemoryCurrencyProvider(Collections.emptyList()),
                "EUR"
        );
        String cTable = currencyInformer.inform(
                "USD",
                "2011-11-11",
                "2011-11-12"
        );

    }
}
