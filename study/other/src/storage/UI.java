package storage;
import java.io.File;
import java.util.Scanner;

public class UI {
    Scanner scanner = new Scanner(System.in);
    Storage storage;

    public UI() {

    }

    public void startPanel(){
        System.out.println("Storage panel");
        drawLine();
        System.out.println("Please add csv file > format: 'filename.csv' ");
        String input = "null";
        input = scanner.nextLine();
        File file = new File(input);
        if (file.exists()) { // checks if file exists
            storage = new Storage(input);
            menuOne();
        }
        else { // if file not exist
            System.out.println(" File name is wrong or not exist");
            startPanel();
        }
    } // starts menu
    private void menuOne(){ // first menu logic
        String input = "null";
        while (true){ // do loop until user not enter x
            drawLine();

            System.out.println("Choose operation:");
            System.out.println("[1] Print CSV file");
            System.out.println("[2] Check by item quantity");
            System.out.println("[3] Check by expiration date");
            System.out.println("[4] Check which already expired");
            System.out.println("[5] Sort by quantity");
            System.out.println("[6] Sort by expiration date");
            System.out.println("[7] Sort by name");
            System.out.println("[8] Save file");
            System.out.println("[x] Exit");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                storage.printAllCSV();
            }
            else if (input.equals("2")) {
                drawLine();
                System.out.println("Please enter quantity");
                storage.searchAndPrintQuantity(Integer.parseInt(scanner.nextLine()));
            }
            else if (input.equals("3")) {
                drawLine();
                System.out.println("Please enter year > format: yyyy ");
                String year=scanner.nextLine();
                System.out.println("Please enter month > format: MM ");
                String month=scanner.nextLine();
                System.out.println("Please enter day > format: dd ");
                storage.searchAndPrintDate(year,month,scanner.nextLine());
            }
            else if (input.equals("4")) {
                drawLine();
                storage.searchExpiredTodayDate();
            }
            else if (input.equals("5")) {
                drawLine();
                storage.sortByQuantity();
            }
            else if (input.equals("6")) {
                drawLine();
                storage.sortByExpirationDate();
            }
            else if (input.equals("7")) {
                drawLine();
                storage.sortByName();
            }
            else if (input.equals("8")) {
                drawLine();
                System.out.println("Please enter file name > format: filename.csv");
                storage.updateCSV(scanner.nextLine());
            }
            else if (input.equals("x")) { // if input x , break loop
                break;
            }
        }
    } //  choose operation menu and logic
    private void drawLine(){
        for (int i = 0; i < 22*4; i++) { System.out.print("-"); }
        System.out.println();
    }
}
