import lt.vtvpmc.java.imperial.AbstractCubeTest;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class Test extends AbstractCubeTest {

    protected MetricCube adapt(ImperialCube imperialCube) {
        return new MyMetricCube(imperialCube);
    }
}
