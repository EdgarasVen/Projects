package lt.weatherapp.weatherapp.service;
import com.google.gson.Gson;
import lt.weatherapp.weatherapp.fetch.UrlBuilder;
import lt.weatherapp.weatherapp.fetch.WeatherProvider;
import lt.weatherapp.weatherapp.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;


@Service
public class DataUpdater {

    private static final Logger log = LoggerFactory.getLogger(DataUpdater.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private final Repository repository;

    @Autowired
    public DataUpdater(Repository repository) {
        this.repository = repository;
    }

    @Scheduled(fixedRateString = "${schedule.rate.string}")
    public void currentTime() throws IOException {
        //log.info("Current Time      = {}", dateFormat.format(new Date()));
        String url=UrlBuilder.build(
                54.6872,
                25.2797,
                "temp",
                "G91qMVIGU9YKyEbjuzl06UeX8fdjNoIu"
        );
        //System.out.println(url);
        String response = WeatherProvider.sendGET(url);
        Gson gson=new Gson();
        Weather weather=gson.fromJson(response,Weather.class);
        //Collection<Weather> weather=gson.fromJson(response, new TypeToken<List<Weather>>(){}.getType());
        //System.out.println("response ----"+response);
        //System.out.println("weather ----"+weather);
        repository.addWeather(weather);
    }

}