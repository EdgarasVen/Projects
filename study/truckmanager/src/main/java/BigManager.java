import lt.itakademija.exam.Packet;
import lt.itakademija.exam.Truck;
import lt.itakademija.exam.TruckManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigManager implements TruckManager {
    Map<String,Truck> truckMap=new HashMap<String, Truck>();
    Map<String,Packet> packetMap=new HashMap<String, Packet>();


    public Truck registerTruck(String id, int capacity) {
        checkNullAndEmpty(id,capacity);
        truckMap.put(id,new Truck(id,capacity));
        return truckMap.get(id);
    }

    public List<Truck> getTrucks() {
        return new ArrayList<Truck>(truckMap.values());
    }

    public Truck getTruckById(String id) {
        checkNullAndEmpty(id);
        return truckMap.getOrDefault(id, null);
    }

    public Packet registerPacket(String id, int volume) {
        checkNullAndEmpty(id,volume);
        packetMap.put(id,new Packet(id,volume));
        return packetMap.get(id);
    }

    public void assignTruck(Truck truck, Packet packet) {
        checkNullAndEmpty(truck,packet);
        packetMap.get(packet.getId()).assignTruck(truckMap.get(truck.getId()));
    }

    public List<Packet> getPackets(String truckId) {
        checkNullAndEmpty(truckId);
        return truckMap.getOrDefault(truckId, null).getPackets();
    }

    public int getTotalTruckCapacity() {
        return  truckMap.values().stream()
                .mapToInt(Truck::getCapacity)
                .sum();
    }

    public double getAveragePackageVolume(String truckId){
        return  truckMap.get(truckId).getPackets().stream()
                .mapToDouble(Packet::getVolume)
                .average()
                .orElse(Double.NaN);

    }

    private void checkNullAndEmpty (String id, int capacity){
        if( capacity <= 0 ) throw new IllegalArgumentException();
        if(id == null ) throw new NullPointerException();
        if( id.equals("") ) throw new IllegalArgumentException();
    }
    private void checkNullAndEmpty (String id){
        if(id == null ) throw new NullPointerException();
        if( id.equals("") ) throw new IllegalArgumentException();
    }
    private void checkNullAndEmpty (Truck truck, Packet packet){
        if(truck == null || packet == null) throw new NullPointerException();
    }

}
