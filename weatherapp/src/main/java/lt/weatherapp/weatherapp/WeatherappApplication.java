package lt.weatherapp.weatherapp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lt.weatherapp.weatherapp.fetch.UrlBuilder;
import lt.weatherapp.weatherapp.fetch.WeatherProvider;
import lt.weatherapp.weatherapp.model.Weather;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class WeatherappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WeatherappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
