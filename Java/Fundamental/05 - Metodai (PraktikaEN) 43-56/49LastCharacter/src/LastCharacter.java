import java.util.Scanner;


public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(lastIndex(reader.nextLine()));
    }
    public static char lastIndex(String text){
        return text.charAt(text.length()-1);
    }
}
