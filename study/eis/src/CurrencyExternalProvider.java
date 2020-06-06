import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class CurrencyExternalProvider implements CurrencyProvider{
    private ArrayList<String> currencyInfoList;

    @Override
    public ArrayList<String> provide(CurrencyParameters parameters){
        try {

            DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =factory.newDocumentBuilder();
            Document document;

            String url = new HttpUrlBuilder().build(parameters);
            URL urlObj = new URL(url);

            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("user-agent", "text/xml");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream xml=connection.getInputStream();
                document=builder.parse(xml);
                Element element = document.getDocumentElement();
                currencyInfoList=new HttpXmlParse().parse(element.getChildNodes());
                return currencyInfoList;
            }

        } catch (Exception e) {
            System.out.println("GET problem");
        }
    return currencyInfoList;
    }

}
