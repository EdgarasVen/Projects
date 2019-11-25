
import hangman.Hangman;

import java.util.Random;
import java.util.Scanner;

public class HangmanUserInteface {
    private static String word;
    private static String hideWord;
    private static int count=0;


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        HangmanUserInteface.word=createWord();
        HangmanUserInteface.hideWord =hideRealWord(word);


        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        while (hangman.gameOn()){
            System.out.println("Type a command:");
            String command = reader.nextLine();
            //command guess
            if (command.length()==1){
                hangman.guess(command);
            }
            //command quit
            if (command.equals("quit")){
                System.out.println("Thank you for playing!");
                break;
            }
            //command status
            if(command.equals("status")){
                printStatus();
            }
            //nothings enters
            if (command==null){
                printMenu();
            }
            printMan();
            printWord();
        }
        // PROGRAM YOUR SOLUTION HERE


        System.out.println("Thank you for playing!");
    }
    /////
    public static String createWord(){
        String[] words = {"programming", "fish", "cairo", "arabs", "quraan", "sunnah",
                "editor", "photography", "artist", "software", "write", "read", "gaming",
                "lunch", "participate", "lunch", "dinner", "house", "books", "animals"};
        Random ran = new Random();
        int randomNumber = ran.nextInt(words.length);
        HangmanUserInteface.count=0;

        return (words[randomNumber]);
    }
    /////
    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
    /////
    public static void printStatus(){

    }
    /////
    public static void printWord(){

    }
    /////
    public static void printMan(){

    }
    /////
    public static String guess(String letter){


    return letter;
    }
    /////
    private static String hideRealWord(String originalWord) {

        for (int i = 0; i < originalWord.length(); i++) {
            char ASTERISK = '*';
            originalWord = originalWord.replace(originalWord.charAt(i), ASTERISK);
        }
        return originalWord;
    }
}
