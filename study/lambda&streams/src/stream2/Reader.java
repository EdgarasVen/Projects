package stream2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader implements Readable {
    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Stream<String> openStream() {
        try {
            return Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Failed scan file");
            return null;
        }
    }

}
