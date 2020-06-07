package lt.weatherapp.weatherapp.fetch;

public class UrlBuilder {
    private static final String URL = "https://api.climacell.co/v3/weather/";

    //private static final String URL = "https://api.climacell.co/v3/weather/historical/station";
    // ?lat=54.6872
    // &lon=25.2797
    // &start_time=2020-05-06T12%3A50%3A50Z
    // &end_time=2020-05-07T12%3A00%3A18.878Z
    // &fields%5B%5D=temp
    // &apikey=G91qMVIGU9YKyEbjuzl06UeX8fdjNoIu";

    //private static final String GET_URL = "https://api.climacell.co/v3/weather/realtime
    // ?lat=54.6872
    // &lon=25.2797
    // &fields%5B%5D=temp
    // &fields%5B%5D=humidity
    // &apikey=G91qMVIGU9YKyEbjuzl06UeX8fdjNoIu";

    public static String build(double lat, double lon, String startTime, String endTime, String fields, String apiKey ){
        return URL+"historical/station"+
                "?lat="+lat+
                "&lon="+lon+
                "&start_time="+startTime+
                "&end_time=%s"+endTime+
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
