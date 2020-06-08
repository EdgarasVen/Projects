package lt.weatherapp.weatherapp.service;

import lombok.extern.slf4j.Slf4j;
import lt.weatherapp.weatherapp.model.Weather;
import lt.weatherapp.weatherapp.repo.RepoWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Service interface for class {@link Repository}
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@Slf4j
@Service
public class RepositoryImp implements Repository{
    private final RepoWeather database;

    @Autowired
    public RepositoryImp(RepoWeather database) {
        this.database = database;
    }

    /**
     *
     * @return Sorted by date List of weathers.
     */
    @Override
    public List<Weather> getAllWeather() {
        List <Weather> list =database.findAll();
        Collections.sort(list);
        log.info("IN getAllWeather find all weathers, list size = {}", list.size());
        return list;
    }

    /**
     * Put weather into database.
     */
    @Override
    public void addWeather(Weather weather) {
        database.save(weather);
        log.info("IN addWeather saved weather = {}", weather);
    }

    /**
     * Put List of weathers into database and add to each latitude & longitude.
     */
    @Override
    public void addAllWeather(Collection<Weather> weathers,double lat, double lon) {
        for (Weather weather:weathers) {
            weather.setLat(lat);
            weather.setLon(lon);
        }
        database.saveAll(weathers);
        log.info("IN addAllWeather saved list of weathers, list size = {}", weathers.size());
    }
}
