import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(firstIndex(reader.nextLine()));
    }
    public static char firstIndex(String text){
        return text.charAt(0);
    }
}
