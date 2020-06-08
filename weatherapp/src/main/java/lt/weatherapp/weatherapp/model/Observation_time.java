package lt.weatherapp.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String value;
    @JsonIgnore
    @OneToOne(mappedBy = "observation_time")
    private Weather weather;
}
