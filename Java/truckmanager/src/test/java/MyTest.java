import lt.itakademija.exam.Packet;
import lt.itakademija.exam.Truck;
import lt.itakademija.exam.TruckManager;
import lt.itakademija.exam.grader.ExamTask;
import lt.itakademija.exam.test.BaseTest;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MyTest extends BaseTest {
    BigManager man;
    protected TruckManager createTransportManager() {
        man = new BigManager();
        return man;
    }

    @Test
    @ExamTask(
            grade = 0.1D
    )
    public void CheckTestWork(){
        assertNotNull("Test works",man);
    }

    @Test
    @ExamTask(
            grade = 0.9D
    )
    public void truckManagerGetsAveragePackageVolume(){
        Truck registeredTruck = man.registerTruck("TRUCK-1", 100);

        String packageName;
        for (int i = 11; i < 17; i++) {
            packageName = "package-" + i;
            Packet registeredPackage = man.registerPacket(packageName, i);
            man.assignTruck(registeredTruck, registeredPackage);
        }
        assertEquals("Method must show average package volume in expected truck "
                ,Double.doubleToLongBits(13.5),Double.doubleToLongBits(man.getAveragePackageVolume(registeredTruck.getId())));
    }
}
