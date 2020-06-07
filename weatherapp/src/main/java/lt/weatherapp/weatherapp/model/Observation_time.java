package lt.weatherapp.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Observation_time{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    @OneToOne(mappedBy = "observation_time")
    private Weather weather;
}
