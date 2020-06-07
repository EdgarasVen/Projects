package lt.weatherapp.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double lat;
    private double lon;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "temp_id", referencedColumnName = "id")
    private Temp temp;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "time_id", referencedColumnName = "id")
    private Observation_time observation_time;

}

