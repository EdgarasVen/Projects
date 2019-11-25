
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (squareMeters<otherApartment.getSquareMeters())
            return false;
        else
            return true;
    }

    public int priceDifference(Apartment otherApartment) {
        int number=(squareMeters*pricePerSquareMeter)-(otherApartment.getSquareMeters()*otherApartment.getPricePerSquareMeter());
        return  number < 0 ? -number : number;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if ((squareMeters*pricePerSquareMeter)>(otherApartment.getSquareMeters()*otherApartment.getPricePerSquareMeter()))
            return true;
        else return false;
    }
}
