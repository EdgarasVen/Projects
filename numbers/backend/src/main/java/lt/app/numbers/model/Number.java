package lt.app.numbers.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Number class .
 * Class represent one integer for data base.
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
public class Number extends BaseEntity{
    public Number(int number, Request request) {
        this.number = number;
        this.request = request;
    }

    private int number;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id")
    private Request request;
}
