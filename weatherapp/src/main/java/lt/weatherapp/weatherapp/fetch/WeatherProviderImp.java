package lt.weatherapp.weatherapp.fetch;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class fetching from provided url {@link UrlBuilder} data.
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@Slf4j
public class WeatherProviderImp {

    /**
     * @param url string from where to fetch.
     * @return String of fetched data.
     *
     */

    public static String provide(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        log.info("url   ::    {}",url);
        log.info("response code::    {}",responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } else {
            log.info("GET request not worked ::    {}",responseCode);
            return null;
        }

    }
}
