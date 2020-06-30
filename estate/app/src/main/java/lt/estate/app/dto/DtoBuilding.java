package lt.estate.app.dto;

import lombok.Data;
import lt.estate.app.enums.PropertyType;
import lt.estate.app.model.Building;
import lt.estate.app.model.Owner;

@Data
public class DtoBuilding {
    private String address;
    private Owner owner;
    private double size;
    private Long value;
    private PropertyType type;

    public Building toBuilding() {
        return null;
    }
}
