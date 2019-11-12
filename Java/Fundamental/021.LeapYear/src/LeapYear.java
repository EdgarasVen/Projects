
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner r = new Scanner(System.in);
        System.out.println("Type a year:");
        int a = r.nextInt();
        
        if ((a%400==0)||(a%100!=0)&&(a%4==0))
        	System.out.println("The year is a leap year.");
        
        else 
        	System.out.println("The year is not a leap year.");

    }
}
