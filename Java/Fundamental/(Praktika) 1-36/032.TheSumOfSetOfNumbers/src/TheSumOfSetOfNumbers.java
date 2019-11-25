
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int n = Integer.parseInt(reader.nextLine());
        int i=0,sum=0;
        while (i<=n){
            sum=sum+i;
            i++;
            System.out.println(sum);
        }
        System.out.println("Sum is "+sum);

    }
}
