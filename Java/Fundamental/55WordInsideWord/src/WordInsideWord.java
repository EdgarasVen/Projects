
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("type first word");
        String word1 = reader.nextLine();
        System.out.println("type second word");
        String word2 = reader.nextLine();
        if(word1.equals(word2))
            System.out.println("It the same word");
        else
        for (int i = 0; i < word1.length()-1; i++) {
           if (word1.substring(i).equals(word2))
               System.out.println("the word '"+word2+"' is in word '"+word1+"'");
        }
    }
}
