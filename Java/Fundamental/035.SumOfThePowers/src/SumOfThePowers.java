
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //double i=3, j=2;
        //System.out.println(Math.pow(i,j));

        System.out.println("Type a number:");
        int n =Integer.parseInt(reader.nextLine());
        int i=0,sum=0;
        while (i<=n){
            sum=sum+(int)Math.pow(2,i);
            i++;
           // System.out.println(sum);
        }

        System.out.println("The result is"+sum);
    }
}
