package stream2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Printable printer = new Printer(new Reader("src/wordlist.txt"));
        //printer.printFirstTenLetters();
        //printer.printFirstEightLettersWithABC();
        //printer.printFirstEightLettersWithMixedCase();
        //printer.printLongestWordWithAE();
        //printer.printShortestWordWithQ();
        //printer.makeFileWithWords();
        //printer.printNumberOfFiles();
    }
}
