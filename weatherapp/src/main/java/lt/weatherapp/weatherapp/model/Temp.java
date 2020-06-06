package lt.weatherapp.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Temp{
    private int value;
    private String units;

}
