import lt.itakademija.exam.IdGenerator;
import lt.itakademija.exam.Warehouse;
import lt.itakademija.exam.test.BaseTest;

public class MyTest  extends BaseTest {
    protected Warehouse createWarehouse(IdGenerator idGenerator, IdGenerator idGenerator1, int i) {
        return new MyWarehouse(idGenerator,idGenerator1,i);
    }
}
