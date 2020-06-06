package stream2;

import java.util.stream.Stream;

public interface Readable {
    Stream<String> openStream();
}
