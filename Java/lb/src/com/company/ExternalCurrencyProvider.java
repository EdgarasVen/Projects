package com.company;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExternalCurrencyProvider implements CurrencyProvider {

    @Override
    public String provide(String type,String cur, DateRange range) {
        try {
            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =factory.newDocumentBuilder();
            Document document;

            String url = new UrlBuilder().BuildUrl(type,cur,range);
            URL urlObj = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("user-agent", "text/xml");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader inputReader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));

                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = inputReader.readLine()) != null) {
                    response.append(inputLine).append("\n");
                }
                System.out.println(inputReader.toString());
                inputReader.close();
                return response.toString();
            }
        } catch (IOException | ParserConfigurationException e) {
            System.out.println("Fetch problem");
        }
        // fetch data
        // parse from xml


        return cur;
    }
}
