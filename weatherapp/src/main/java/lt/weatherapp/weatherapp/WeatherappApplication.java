package lt.weatherapp.weatherapp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import lt.weatherapp.weatherapp.fetch.UrlBuilder;
import lt.weatherapp.weatherapp.fetch.WeatherProvider;
import lt.weatherapp.weatherapp.model.Weather;
import lt.weatherapp.weatherapp.service.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Slf4j
@SpringBootApplication
public class WeatherappApplication implements CommandLineRunner {
	@Autowired
	Repository repository;

	@Value("${spring.enable.scheduling}")
	private String scheduling;

	@Value("${climacell.apikey}")
	private String key;


	public static void main(String[] args) {
		SpringApplication.run(WeatherappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		double lat=54.6872;
		double lon=25.2797;
		LocalDate startDate = LocalDate.now().minusMonths(1);
		LocalDate endDate = LocalDate.now().minusMonths(1);

		int i=1;
		//while (startDate.plusDays(i).compareTo(currentdate)!=0){
			String start=startDate.plusDays(i).toString();
			String end=endDate.plusDays(i+1).toString();
			System.out.println(start+"__"+end);
			String response=WeatherProvider.provide(UrlBuilder.build(
					lat,
					lon,
					start,
					end,
					"temp",
					key
			));
			Gson gson=new Gson();
			if(response!=null){
			Collection<Weather> weathers=gson.fromJson(response, new TypeToken<List<Weather>>(){}.getType());
			repository.addAllWeather(weathers,lat,lon);
			}else
				log.info("error with fetch, response = {}", response);
			//i++;
		//}
	}
}
