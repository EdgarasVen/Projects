package com.company;


import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExternalCurrencyProvider implements CurrencyProvider {
    static void printElements(NodeList nodes){
        for (int i = 0; i < nodes.getLength(); i++) {
            if(nodes.item(i) instanceof Element ) {
                String value="";
                System.out.println(((Element) nodes.item(i)).getTagName());
                if (nodes.item(i).hasChildNodes()) {
                    printElements(nodes.item(i).getChildNodes());
                    if(!nodes.item(i).getTextContent().trim().isEmpty()){
                        Text text = (Text)nodes.item(i).getFirstChild();
                        value +=" = "+text.getData().trim();
                        System.out.println(value);
                    }
                }
            }
        }
    }
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
                InputStream xml=connection.getInputStream();
                document=builder.parse(xml);
                Element element = document.getDocumentElement();
                printElements(element.getChildNodes());

                createXml(document);
                /*BufferedReader inputReader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));*/
                /*String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = inputReader.readLine()) != null) {
                    response.append(inputLine);
                }
                inputReader.close();
                return response.toString();*/
            }
        } catch (Exception e) {
            System.out.println("Fetch problem");

        }
        // fetch data
        // parse from xml


        return cur;
    }
    public void createXml(Document document){
        FileXmlCreator.createXmlFile(document);
    }
}
