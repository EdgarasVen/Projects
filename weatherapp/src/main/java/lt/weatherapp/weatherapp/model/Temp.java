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
public class Temp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    private String units;
    @OneToOne(mappedBy = "temp")
    private Weather weather;

}
