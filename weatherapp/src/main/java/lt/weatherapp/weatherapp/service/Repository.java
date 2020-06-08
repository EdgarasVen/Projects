package lt.weatherapp.weatherapp.service;

import lt.weatherapp.weatherapp.model.Weather;

import java.util.Collection;
import java.util.List;

public interface Repository {

    List<Weather> getAllWeather ();
    Weather getRealTimeWeather();

    void addWeather(Weather weather);
    void addAllWeather(Collection<Weather> weathers,double lat, double lon);
}
