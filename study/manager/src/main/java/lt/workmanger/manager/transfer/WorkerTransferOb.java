package lt.workmanger.manager.transfer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lt.workmanger.manager.model.Worker;

@Data
@Setter
@Getter
public class WorkerTransferOb {

    private Long id;
    private String firstName;
    private String lastName;
    private String responsibility;
    private Long salary;

    public Worker build(){
        return new Worker(id,
                firstName,
                lastName,
                responsibility,
                salary);
    }
}
