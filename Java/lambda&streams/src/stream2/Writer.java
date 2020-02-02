package stream2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

public class Writer {
    public static void createFile(Collection<String> someList, String fileName){
        try {
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            for (String word: someList) {
                writer.write(word+"\n");
            }

            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
