package lambda5;

import java.util.stream.Stream;

public class Printer implements Printable{
    Stream<String> file;

    public Printer(Reader reader) {
        file = reader.openStream();
    }

    @Override
    public void printFirstTenLetters() {
        file.limit(10).forEach(System.out::println);
    }

    @Override
    public void printFirstEightLettersWithABC() {
        file.filter(word->word.contains("a")&&word.contains("b")&&word.contains("c"))
                //.filter(word->word.contains("b"))
                //.filter(word->word.contains("c"))
                .limit(8)
                .forEach(System.out::println);
    }

    @Override
    public void printFirstEightLettersWithMixedCase() {
        file.filter(word->word.contains("A"))
                .filter(word->word.contains("B"))
                .filter(word->word.contains("C"))
                .limit(8)
                .forEach(System.out::println);
    }

    @Override
    public void printLongestWordWithAE() {

    }

    @Override
    public void printShortestWordWithQ() {

    }

    @Override
    public void makeFileWithWords() {

    }

    @Override
    public void printNumberOfFiles() {

    }
}
