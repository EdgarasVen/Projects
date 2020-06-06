package lt.weatherapp.weatherapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Weather {
    //private float lat;
    //private float lon;
    private Temp temp;
    //private Humidity humidity;
    private Observation_time observation_time;

}

