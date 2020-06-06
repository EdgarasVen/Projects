package lambda3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words= addWordsToList();
        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);

        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
        List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        List<Integer> bigNums = StringUtils.allMatches(nums, n -> n>500);

        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        List<Integer> wordLengths = StringUtils.transformedList(words, String::length);

        System.out.println(wordLengths);

    }

    private static List<String> addWordsToList(){
        String s = "Abstracts are used to implement an abstraction in Java. A method with no definition must be declared as abstract and the class containing it must be declared as abstract. Abstract classes cannot be instantiated. Abstract methods must be implemented in the sub classes. The abstract keyword cannot be used with variables or constructors. Note that an abstract class isn't required to have an abstract method at all";
        String[] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        return new ArrayList<>(Arrays.asList(words));
    }
}
