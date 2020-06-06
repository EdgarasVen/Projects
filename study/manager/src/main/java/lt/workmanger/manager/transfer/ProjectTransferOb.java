package lt.workmanger.manager.transfer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lt.workmanger.manager.model.Project;

@Data
@Setter
@Getter
public class ProjectTransferOb {

    private Long id;
    private String name;
    private String address;
    private Long budget;

    public Project build(){
        return new Project(id,
                name,
                address,
                budget);
    }
}
