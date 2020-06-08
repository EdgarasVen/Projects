package lt.weatherapp.weatherapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Temp{
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private String units;
    @JsonIgnore
    @OneToOne(mappedBy = "temp")
    private Weather weather;

}
