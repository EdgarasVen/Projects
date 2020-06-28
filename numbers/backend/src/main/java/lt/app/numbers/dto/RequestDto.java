package lt.app.numbers.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lt.app.numbers.model.Number;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Data transfer class for request.
 *
 * @author Edgaras Venzlauskas
 * @version 1.0
 */

@Data
@Getter
@Setter
@NoArgsConstructor
public class RequestDto {

    private List<Integer> numbers;

    public List<Number> createNumbers(){
        List<Number> list = new ArrayList<>();
        for (Integer i: numbers
             ) {
            Number number = new Number();
            number.setNumber(i);
            number.setCreated(new Date());
            list.add(number);
        }
        return list;
    }
}
