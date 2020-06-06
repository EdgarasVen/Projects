package lt.weatherapp.weatherapp;

import lt.weatherapp.weatherapp.fetch.WeatherProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeatherappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WeatherappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		WeatherProvider.sendGET();
	}
}
