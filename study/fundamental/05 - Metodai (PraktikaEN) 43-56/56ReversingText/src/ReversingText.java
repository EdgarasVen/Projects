
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String rev= "";
        for (int i = text.length()-1; i >= 0 ; i--) {
            rev= rev + text.charAt(i);
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return rev;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
