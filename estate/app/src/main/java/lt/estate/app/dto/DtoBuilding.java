package lt.estate.app.dto;

import lombok.Data;
import lt.estate.app.enums.PropertyType;
import lt.estate.app.enums.Status;
import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;

import java.util.Date;

@Data
public class DtoBuilding {
    private String address;
    private Owner owner;
    private double size;
    private Long value;
    private PropertyType type;

    public Building toBuilding() {
        Building building= new Building();
        building.setCreated(new Date());
        building.setUpdated(new Date());
        building.setAddress(address);
        building.setType(type);
        building.setValue(value);
        building.setSize(size);
        building.setOwner(owner);
        building.setStatus(Status.ACTIVE);
        return building;
    }
}
