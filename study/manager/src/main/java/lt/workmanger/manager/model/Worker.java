package lt.workmanger.manager.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class Worker {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String responsibility;
    private Long salary;

    //@JsonIgnore
    //@JsonManagedReference
    @OneToMany(mappedBy = "worker" , cascade = CascadeType.ALL)
    private List<Assignment> assignments = new ArrayList<>();

    //@JsonIgnore
    //@JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "workers_on_projects",
            joinColumns = @JoinColumn(name = "worker_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private List<Project> projects = new ArrayList<>() ;

    public Worker(Long id, String firstName, String lastName, String responsibility, Long salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.responsibility = responsibility;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", responsibility='" + responsibility + '\'' +
                ", salary=" + salary +
                '}';
    }
}
