
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");// Write your code here
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int n=Integer.parseInt(reader.nextLine());// ask the user how many times the text should be printed
        while (n!=0){
            printText();
            n--;// use the while structure to call the printText method several times
        }

    }
}