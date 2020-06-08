package lt.weatherapp.weatherapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Class represents weather entity.
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Weather implements Comparable<Weather>{
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

    /**
     * Compare weather by data and time.
     * @return 0 or 1
     */
    @Override
    public int compareTo(Weather o) {
        return o.getObservation_time().getValue().compareTo(getObservation_time().getValue());
    }
}

