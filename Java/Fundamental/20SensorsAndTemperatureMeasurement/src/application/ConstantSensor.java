package application;

public class ConstantSensor implements Sensor {
    private int number;
    private boolean status=true;

    public ConstantSensor(int number) {
        this.number = number;
    }

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void on() {
        status = true;
    }

    @Override
    public void off() {
        status=false;
    }

    @Override
    public int measure() {
        return number;
    }
}
