package application;

public class Thermometer implements Sensor {
    private boolean status=false;
    private int randomNumber=2;
    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        status=true;
    }

    @Override
    public void off() {
        status=false;
    }

    @Override
    public int measure() {
        if (!status){
            throw new IllegalStateException("Thermometer is off");
        }
        return randomNumber;
    }
}
