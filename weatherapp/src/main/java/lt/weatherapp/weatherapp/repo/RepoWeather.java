package lt.weatherapp.weatherapp.repo;

import lt.weatherapp.weatherapp.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoWeather extends JpaRepository<Weather, Long> {
}
