import com.eisgroup.javaexam.library.Library;
import com.eisgroup.javaexam.library.test.BaseLibraryTest;

public class TestClass extends BaseLibraryTest {
    @Override
    protected Library getLibrary() {
        return new Lib();
    }
}
