package lt.weatherapp.weatherapp.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Configuration class for scheduling {@link lt.weatherapp.weatherapp.service.ScheduledWeatherUpdater}
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@EnableScheduling
@Configuration
@ConditionalOnProperty(name = "spring.enable.scheduling")
public class Scheduling {
}
