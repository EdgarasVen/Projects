
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count=0;

        while(true) {
            count++;
            System.out.println("Guess a number:");
            int num = Integer.parseInt(reader.nextLine());
            if ( num==numberDrawn ){
                System.out.println("Congratulations, your guess is correct!, guesses made: "+ count);
                break;
            }
            else{
                if ( num<numberDrawn )
                    System.out.println("The number is greater, guesses made:"+ count);
                else if( num>numberDrawn )
                    System.out.println("The number is lesser, guesses made:"+ count);
            }

            // program your solution here. Do not touch the above lines!
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
