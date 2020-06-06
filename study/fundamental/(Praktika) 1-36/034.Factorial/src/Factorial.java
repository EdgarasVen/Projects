import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Type a number:");
        int n = Integer.parseInt(r.nextLine());
        int i=1, sum=1;
        while (i<=n){
            sum=sum*i;
            i++;
            System.out.println(sum);
        }
        System.out.println("Factorial is "+sum);

    }
}
