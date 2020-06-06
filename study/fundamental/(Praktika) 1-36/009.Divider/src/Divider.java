
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        double a = reader.nextInt();
        System.out.println("Type another number:");
        double b = reader.nextInt();
        double res = a/b ;
        System.out.println("Division: "+a+" / "+b +" = "+ res);

        // Implement your program here. Remember to ask the input from user.
    }
}
