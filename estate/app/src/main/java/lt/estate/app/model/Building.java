package lt.estate.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lt.estate.app.enums.PropertyType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
public class Building extends BaseEntity{

    @Column(name = "name")
    private String address;

    @Column(name = "name")
    private double size;

    @Column(name = "name")
    private Long value;

    @Enumerated(EnumType.STRING)
    private PropertyType type;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

}
