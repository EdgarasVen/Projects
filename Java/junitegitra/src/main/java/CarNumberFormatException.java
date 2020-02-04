public class CarNumberFormatException extends Exception {
    private String number;

    public CarNumberFormatException( String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Wrong car number format :"+number;
    }
}
