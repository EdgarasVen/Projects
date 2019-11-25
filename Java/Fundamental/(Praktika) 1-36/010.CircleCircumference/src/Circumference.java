
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        double a = reader.nextDouble();
        double x = 2*Math.PI*a;
        System.out.println("Circumference of the circle:"+x);

        // Program your solution here 
    }
}
