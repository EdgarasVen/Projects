import lt.vtvpmc.municipality.AbstractMunicipalityTest;
import lt.vtvpmc.municipality.Municipality;

public class MyTest extends AbstractMunicipalityTest {
    public Municipality getMunicipality() {
        return new MyMunicipality();
    }
}
