package storage;

public class Item {
    private String name;
    private String code;
    private String quantity;
    private String expDate;

    public Item(String name, String code, String quantity, String expDate) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.expDate = expDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    } // used by deleting duplicates and sum all quantity, maybe better to add new method for more encapsulation

    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public String getQuantity() {
        return quantity;
    }
    public String getExpDate() {
        return expDate;
    }
    public String converter(){
        return name+","+code+","+quantity+","+expDate;
    } // used then creating new file
    @Override
    public String toString() {
        return String.format("|%-20s|",name)+String.format("|%-20s|",code)+String.format("|%-20s|",quantity)+String.format("|%-20s|",expDate);
    }


}
