package lt.estate.app.dto;

import lombok.Data;
import lt.estate.app.enums.Status;
import lt.estate.app.model.Owner;

import java.util.Date;


@Data
public class DtoOwner {
    private String name;
    private String surname;
    private String address;
    private String telephone;

    public Owner toOwner() {
        Owner owner =new Owner();
        owner.setCreated(new Date());
        owner.setUpdated(new Date());
        owner.setName(name);
        owner.setSurname(surname);
        owner.setAddress(address);
        owner.setTelephone(telephone);
        owner.setStatus(Status.ACTIVE);
        return owner;
    }
}
