
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int i = Integer.parseInt(reader.nextLine());
        System.out.println("Last:");
        int n = Integer.parseInt(reader.nextLine());
        int sum=0;
        while (i<=n){
            sum=sum+i;
            i++;
            System.out.println(sum);
        }
        System.out.println("Sum is "+sum);
    }
}
