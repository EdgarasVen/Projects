public class Flight extends Airport{
    private String departureCode;
    private String destinationCode;
    private Airplane plane ;

    public Flight (Airplane plane,String departureCode, String destinationCode){
        this.plane=plane;
        this.departureCode=departureCode;
        this.destinationCode=destinationCode;
    }
    @Override
    public String toString() {
        return plane+" ("+departureCode+"-"+destinationCode+")";
    }
}
