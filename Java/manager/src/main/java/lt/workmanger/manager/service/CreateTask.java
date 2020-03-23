package lt.workmanger.manager.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lt.workmanger.manager.model.Task;

@Data
@Setter
@Getter
public class CreateTask {

    private Long id;
    private String name;
    private Long hours;

    public Task build(){
        return new Task(
                name,
                hours);
    }
}
