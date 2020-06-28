package lt.app.numbers.model;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Request class .
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Request extends BaseEntity{

    @Column(name = "winnable")
    private Boolean winnable;

    @OneToMany(mappedBy = "request",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<Number> numbers;

    @Column(name = "steps")
    private int pathSteps;

    @Column(name = "number")
    private String numberString;

    public void createNumberString(){
        List<Integer> list = getNumbersList();
        numberString=list.toString();
    }

    public List<Integer> getNumbersList(){
        List<Integer> list = new ArrayList<>();
        for (Number i: numbers
        ) { list.add(i.getNumber());
        }
        return list;
    }
}
