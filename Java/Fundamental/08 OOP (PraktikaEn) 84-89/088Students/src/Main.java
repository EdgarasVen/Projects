
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Alan Turing","017635727"));
        list.add(new Student("Linus Torvalds","017234727"));
        list.add(new Student("Steve Jobs","021324567"));

        for (Student st:list
             ) {
            System.out.println(st);
        }
    }
}