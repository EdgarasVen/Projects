package generics;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(new Shape("red"));
        listOfShapes.add(new Shape("black"));
        Shape lastShape =  ElementUtils.lastElement(listOfShapes);
        System.out.println(lastShape);
        List<String> wordList = new ArrayList<>();
        wordList.add("one");
        wordList.add("two");
        String lastWord = ElementUtils.lastElement(wordList);
        System.out.println(lastWord);
        System.out.println("------------------------------------");
        List<String> wordList2 =new ArrayList<>();
        wordList2.add("one one");
        wordList2.add("two two");
        String lastWord1 = ElementUtils.lastElement(wordList2);
        System.out.println(lastWord1);
        String[] wordArray = {"Cheese", "Pepperoni", "Black Olives"};;
        String lastWord2 = ElementUtils.lastElement(wordArray);
        System.out.println(lastWord2);
        System.out.println("------------------------------------");
        Box<String> twoNames = new Box<>("John", "Jane");
        System.out.printf("twoNames=%s.%n", twoNames);
        String name1 = twoNames.getT(); // Value is "John"
        String name2 = twoNames.getT2(); // Value is "Jane"
        Box<Integer> twoNums = new Box<>(8, 5);
        System.out.printf("twoNums=%s.%n", twoNums);
        Integer num1 = twoNums.getT(); // Value is 8
        Integer num2 = twoNums.getT2(); // Value is 5
        System.out.println("------------------------------------");
        Box<Integer> twoNums2 = new Box<>(7, 5);
        System.out.printf("twoNums=%s.%n", twoNums2);
        Integer num11 = twoNums.getT(); // Value is 5
        Integer num22 = twoNums.getT2(); // Value is 7

    }

}
