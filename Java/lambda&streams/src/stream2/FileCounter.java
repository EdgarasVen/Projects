package stream2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class FileCounter {
    public static long countFiles(){
        try (Stream<Path> walk = Files.walk(Paths.get("."))) {
            return  walk.filter(Files::isRegularFile)
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }
    public static long countFolders(){
        try (Stream<Path> walk = Files.walk(Paths.get("."))) {
            return walk.filter(Files::isDirectory)
                    .count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

}
