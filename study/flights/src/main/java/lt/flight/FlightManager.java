package lt.flight;

import lt.itakademija.exam.Passenger;
import lt.itakademija.exam.Plane;
import lt.itakademija.exam.SeatIsOccupiedException;

import java.util.*;

public class FlightManager implements lt.itakademija.exam.FlightManager {
    Map<String,Plane> planeMap = new HashMap<String, Plane>();
    Map<String,Passenger> passengerMap = new HashMap<String, Passenger>();

    public Plane createPlane(String id, int seats) {
        checkNullAndEmpty(id,seats);
        planeMap.put(id,new Plane(id,seats));
        return planeMap.get(id);
    }

    public List<Plane> getCreatedPlanes() {
        return new ArrayList<Plane>(planeMap.values());
    }

    public Plane getPlaneById(String id) {
        checkNullAndEmpty(id);
        return planeMap.get(id);
    }

    public Passenger createPassenger(String name, String surname, int age) {
        checkNullAndEmpty(name ,surname , age);
        passengerMap.put(name+surname,new Passenger(name,surname,age));
        return passengerMap.get(name+surname);
    }

    public void registerPassenger(Plane plane, int seatNo, Passenger passenger) throws SeatIsOccupiedException {
        checkNullAndEmpty(plane,passenger);
        if (planeMap.get(plane.getId()).isSeatOccupied(seatNo)) throw new SeatIsOccupiedException();
        planeMap.get(plane.getId()).registerPassenger(seatNo,passengerMap.get(passenger.getName()+passenger.getSurname()));
    }

    public List<Passenger> getPassengers(String planeId) {
        checkNullAndEmpty(planeId);
        return planeMap.get(planeId).getPassengers();
    }

    public Passenger getOldestPassenger(String planeId) {
        checkNullAndEmpty(planeId);
        return passengerMap.values().stream()
                .max(Comparator.comparing(Passenger::getAge)).orElse(null);
    }

    public double getAveragePassengerAge(String planeId) {
        checkNullAndEmpty(planeId);
        return planeMap.get(planeId).getPassengers().stream()
                .mapToDouble(Passenger::getAge)
                .average()
                .orElse(Double.NaN);
    }

    private void checkNullAndEmpty (String id, int capacity){
        if( capacity <= 0 ) throw new IllegalArgumentException();
        if(id == null ) throw new NullPointerException();
        if( id.equals("") ) throw new IllegalArgumentException();
    }
    private void checkNullAndEmpty (String name, String surname , int age){
        if( age <= 0 ) throw new IllegalArgumentException();
        if(name == null || surname == null) throw new NullPointerException();
        if( name.equals("") || surname.equals("")) throw new IllegalArgumentException();
    }
    private void checkNullAndEmpty (String id){
        if(id == null ) throw new NullPointerException();
        if( id.equals("") ) throw new IllegalArgumentException();
    }
    private void checkNullAndEmpty (Plane plane, Passenger passenger ){
        if(plane == null || passenger == null) throw new NullPointerException();
    }
}
