package lt.weatherapp.weatherapp.repo;

import lt.weatherapp.weatherapp.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JPA database
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

public interface RepoWeather extends JpaRepository<Weather, Long> {
    @Transactional
    public List<Weather> findAllByOrderByIdDesc();
}
