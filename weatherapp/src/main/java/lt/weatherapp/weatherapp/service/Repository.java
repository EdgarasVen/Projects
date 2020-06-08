package lt.weatherapp.weatherapp.service;

import lt.weatherapp.weatherapp.model.Weather;

import java.util.Collection;
import java.util.List;

/**
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

public interface Repository {

    List<Weather> getAllWeather ();

    void addWeather(Weather weather);
    void addAllWeather(Collection<Weather> weathers,double lat, double lon);
}
