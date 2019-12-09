package com.company;

import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collection;

public class ExternalCurrencyProvider implements CurrencyProvider {

    @Override
    public Collection<CurrencyInfo> provide(String cur1, String cur2, DateRange range) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "text/xml");

        } catch (Exception e) {
            e.printStackTrace();
        }
        // fetch data
        // parse from xml
        return null;
    }
}
