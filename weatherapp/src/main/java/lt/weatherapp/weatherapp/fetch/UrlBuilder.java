package lt.weatherapp.weatherapp.fetch;

/**
 * Class builds URL for fetching.
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

public class UrlBuilder {
    private static final String URL = "https://api.climacell.co/v3/weather/";

    public static String build(double lat, double lon, String startTime, String endTime, String fields, String apiKey ){
        return URL+"historical/station"+
                "?lat="+lat+
                "&lon="+lon+
                "&start_time="+startTime+
                "&end_time="+endTime+
                "&fields%5B%5D="+fields+
                "&apikey="+apiKey;
    }

    public static String build(double lat, double lon, String fields, String apiKey ){
        return URL+"realtime"+
                "?lat="+lat+
                "&lon="+lon+
                "&fields%5B%5D="+fields+
                "&apikey="+apiKey;
    }
}
