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
public class Project {

    @Id
    private Long id;
    private String name;
    private String address;
    private Long budget;

    //@JsonIgnore
    @ManyToMany(mappedBy = "projects", cascade = CascadeType.ALL)
    private List<Worker> workers = new ArrayList<>();

    public Project(Long id, String name, String address, Long budget) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", budget=" + budget +
                ", workers=" + workers +
                '}';
    }
}
