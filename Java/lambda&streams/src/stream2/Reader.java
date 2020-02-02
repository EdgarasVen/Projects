package stream2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader {
    private String filePath;

    public Reader(String filePath) {
        this.filePath = filePath;
    }

    public Stream openStream() {
        try {
            return Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Failed scan file");
            return null;
        }
    }

}
