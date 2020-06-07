package lt.weatherapp.weatherapp.service;

import lt.weatherapp.weatherapp.model.Weather;
import lt.weatherapp.weatherapp.repo.RepoWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryImp implements Repository{
    private final RepoWeather database;

    @Autowired
    public RepositoryImp(RepoWeather database) {
        this.database = database;
    }

    @Override
    public List<Weather> getAllWeather() {
        return database.findAll();
    }

    @Override
    public Weather getRealTimeWeather() {
        return database.findAll().get(database.findAll().size()-1);
    }

    @Override
    public void addWeather(Weather weather) {
        database.save(weather);
    }
}
