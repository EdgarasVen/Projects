package lt.weatherapp.weatherapp.service;
import com.google.gson.Gson;
import lt.weatherapp.weatherapp.fetch.UrlBuilder;
import lt.weatherapp.weatherapp.fetch.WeatherProviderImp;
import lt.weatherapp.weatherapp.model.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * Class every hour fetch data.
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@Service
public class ScheduledWeatherUpdater {
    @Value("${climacell.apikey}")
    private String key;

    private static final Logger log = LoggerFactory.getLogger(ScheduledWeatherUpdater.class);
    private final Repository repository;

    @Autowired
    public ScheduledWeatherUpdater(Repository repository) {
        this.repository = repository;
    }

    @Scheduled(fixedRateString = "${schedule.rate.string}")
    public void currentTime() throws IOException, InterruptedException {
        String url=UrlBuilder.build(
                54.6872,
                25.2797,
                "temp",
                key
        );
        String response = WeatherProviderImp.provide(url);
        Gson gson=new Gson();
        Weather weather=gson.fromJson(response,Weather.class);
        log.info("response      = {}", response);
        repository.addWeather(weather);
    }

}