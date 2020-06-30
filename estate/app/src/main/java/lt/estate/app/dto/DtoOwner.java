package lt.estate.app.dto;

import lombok.Data;
import lt.estate.app.model.Owner;


@Data
public class DtoOwner {
    private String name;
    private String surname;
    private String address;
    private String telephone;

    public Owner toOwner() {
        return null;
    }
}
