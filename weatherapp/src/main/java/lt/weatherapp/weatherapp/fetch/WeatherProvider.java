package lt.weatherapp.weatherapp.fetch;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lt.weatherapp.weatherapp.model.Weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.List;

public class WeatherProvider {
    private static final String USER_AGENT = "Mozilla/5.0";
    private static final String GET_URL = "https://api.climacell.co/v3/weather/realtime?lat=54.6872&lon=25.2797&fields%5B%5D=temp&fields%5B%5D=humidity&apikey=G91qMVIGU9YKyEbjuzl06UeX8fdjNoIu";
    private static final String GET_URL2 = "https://api.climacell.co/v3/weather/historical/station?lat=54.6872&lon=25.2797&start_time=2020-05-06T12%3A50%3A50Z&end_time=2020-05-07T12%3A00%3A18.878Z&fields%5B%5D=temp&apikey=G91qMVIGU9YKyEbjuzl06UeX8fdjNoIu";

    public static void sendGET() throws IOException {
        URL obj = new URL(GET_URL2);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        //con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //System.out.println(response.toString());
            Gson gson=new Gson();
            Collection<Weather> weather=gson.fromJson(response.toString(), new TypeToken<List<Weather>>(){}.getType());
            System.out.println(weather.toString());
        } else {
            System.out.println("GET request not worked");
        }

    }
}
