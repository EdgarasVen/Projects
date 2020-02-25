import lt.itakademija.exam.FlightManager;
import lt.itakademija.exam.test.BaseTest;

public class ManagerTest extends BaseTest {
    protected FlightManager createFlightManager() {
        return new lt.flight.FlightManager() {
        };
    }
}
