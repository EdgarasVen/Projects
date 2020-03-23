package lt.workmanger.manager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private Long hoursSpend =0L;

    public Assignment(Worker worker, Task task) {
        this.worker = worker;
        this.task = task;
    }

    public void addHours(Long hours){
        hoursSpend+=hours;
    }

    @Override
    public String toString() {
        return "WorkerTask{" +
                "no=" + no +
                ", worker=" + worker.getFirstName() +
                ", task=" + task.getName() +
                ", hoursSpend=" + hoursSpend +
                '}';
    }

}
