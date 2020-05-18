import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class MyMetricCube implements MetricCube {

    ImperialCube cube;

    public MyMetricCube(ImperialCube cube) {
        this.cube = cube;
    }

    public double getSideInCentimeters() {
        return cube.getSideInInches()*2.54;
    }

    public double getVolumeInCentimeters() {
        return cube.getVolumeInInches()*16.387;
    }

    public String getColor() {
        if(cube.getColor().equals("gray"))
            return "grey";
        else
        return cube.getColor();
    }
}
