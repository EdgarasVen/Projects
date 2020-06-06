package stream2;

import java.util.Collection;

public interface Writable {
    void createFile(Collection<String> someList, String fileName);
}
