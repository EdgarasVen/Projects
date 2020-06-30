package lt.estate.app.dto;

import lombok.Data;
import lt.estate.app.enums.PropertyType;
import lt.estate.app.model.Owner;

/*○ Address (city, street, number)
        ○ Owner
        ○ Size (square meters)
        ○ Market value
        ○ Property type (apartment, house, industrial etc.)*/

@Data
public class DtoOwner {
    private String address;
    private Owner owner;
    private double size;
    private Long value;
    private PropertyType type;

    public Owner toOwner() {
        return null;
    }
}
