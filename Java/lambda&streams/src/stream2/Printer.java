package stream2;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Printer implements Printable{
    Reader reader;

    public Printer(Reader reader) {
        this.reader=reader;
    }

    private Stream<String> startFlow(){
        return reader.openStream();
    }

    private void printLine(){
        System.out.println("-----------------------------------------------------------------------");
    }

    @Override
    public void printFirstTenLetters() {
        startFlow().limit(10).forEach(System.out::println);
        printLine();
    }

    @Override
    public void printFirstEightLettersWithABC() {
        startFlow().filter(word->word.contains("a")&&word.contains("b")&&word.contains("c"))
                .limit(8)
                .forEach(System.out::println);
        printLine();
    }

    @Override
    public void printFirstEightLettersWithMixedCase() {
        startFlow().filter(word->word.contains("A")||word.contains("B")||word.contains("C"))
                .limit(8)
                .forEach(System.out::println);
        printLine();
    }

    @Override
    public void printLongestWordWithAE() {
        System.out.println(startFlow().filter(word->word.contains("a")||word.contains("e"))
                .max(Comparator.comparing(String::length))
                .orElse("Non"));
        printLine();
    }

    @Override
    public void printShortestWordWithQ() {
        System.out.println(startFlow().filter(word->word.contains("q"))
                .min(Comparator.comparing(String::length))
                .orElse("Non"));
        printLine();
    }

    @Override
    public void makeFileWithWords() {
        Writer.createFile(
                startFlow().filter(word->word.contains("wow")||word.contains("cool"))
                .map(word->word.toUpperCase()+"!")
                .sorted()
                .collect(Collectors.toList()),"twitter-words.txt");
    }

    @Override
    public void printNumberOfFiles() {
        System.out.println(FileCounter.countFiles()+FileCounter.countFolders());
        printLine();
    }
}
