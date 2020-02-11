import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class MyTestClass extends BaseTest {
    protected ProjectManager createProjectTracker() {
        return new MyProjectManager();
    }
}
