import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class TestPhil  extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        return new Phil();
    }
}
