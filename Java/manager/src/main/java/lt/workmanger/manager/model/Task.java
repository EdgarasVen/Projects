package lt.workmanger.manager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long hours;

    @JsonIgnore
    @OneToMany(mappedBy = "task" , cascade = CascadeType.ALL)
    private List<Assignment> workersTasks = new ArrayList<>();

    public Task( String name, Long hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
