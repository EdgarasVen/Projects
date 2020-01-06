package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> listOfSensors = new ArrayList<>();
    private boolean status = false;

    public void addSensor (Sensor additional){
        listOfSensors.add(additional);
    }

    public AverageSensor() {

    }

    @Override
    public boolean isOn() {
        int count=0;
        for (Sensor sensor: listOfSensors
        ) {
            if (sensor.isOn()) count++;
        }
        if (count==listOfSensors.size()+1){
            status=true;
        }
        return status;
    }

    @Override
    public void on() {
        for (Sensor sensor: listOfSensors
             ) {
            sensor.on();
        }
        status =true;
    }

    @Override
    public void off() {
        for (Sensor sensor: listOfSensors
        ) {
            sensor.off();
        }
        status=false;
    }

    @Override
    public int measure() {
        if (!status || listOfSensors.isEmpty()){
            throw new IllegalStateException("Average sensor doesn't work");
        }
        int middle = 0;
        for (Sensor sensor :listOfSensors
             ) {
            middle+=sensor.measure();
        }
        return middle/listOfSensors.size();
    }

    public void printAllStatus(){
        for (Sensor sensor :listOfSensors
             ) {
            System.out.println(sensor.isOn());
        }
    }

    public List<Integer> readings(){
        List<Integer> list = new ArrayList<>();
        for (Sensor sensor: listOfSensors
             ) {
            list.add(sensor.measure());
        }
        return list;
    }
}
