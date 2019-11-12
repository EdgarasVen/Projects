
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true){
            System.out.println("Type the password:");
            String n = reader.nextLine();
            if (n.equals(password)) {
                System.out.println("Right!");
                break;
            }
                else
                System.out.println("Wrong!");
            // Write your code here
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
