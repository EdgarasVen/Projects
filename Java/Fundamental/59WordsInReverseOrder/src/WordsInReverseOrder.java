import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true){
            System.out.println("Type a word: ");
            String w=reader.nextLine();
            if (w.isEmpty())
                break;
            else
                words.add(w);
        }
        System.out.println("You typed the following words:");
        for (int i = words.size()-1; i >= 0 ; i--) {
            System.out.println(words.get(i));
        }
    }
}
