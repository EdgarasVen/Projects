import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Airplane> listOfPlanes; // list of all planes
    private ArrayList<Flight> listOfFlights; // list of all flights
    public Airport (){
        listOfPlanes= new ArrayList<>();
        listOfFlights= new ArrayList<>();
    }
    public void startPanel(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
        menuOne();
    } // starts first menu
    public void startService(){
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();
        menuTwo();
    } // starts second menu
    private void menuOne(){ // first menu logic
        String input = "null";
        while (true){ // do loop until user not enter x
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give plane capacity: ");
                int cap = Integer.parseInt(scanner.nextLine());
                listOfPlanes.add(new Airplane(id, cap)); // creates new plane object
            }
            else if (input.equals("2")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                for (Airplane plane : listOfPlanes
                ) { // checks if plane with this ID exist
                    if (id.equals(plane.getId())) {
                        System.out.println("Give departure airport code: ");
                        String dep = scanner.nextLine();
                        System.out.println("Give destination airport code: ");
                        String des = scanner.nextLine();
                        listOfFlights.add(new Flight(plane, dep, des)); // if exist , creates new flight object with that plane
                    }
                    else { // if not exist , print this
                        System.out.println("No such plane");
                    }

                }
            }
            else if (input.equals("x")) { // if input x , break loop
                break;
            }
        }
    } // first menu logic
    private void menuTwo() { // second menu logic
        String input = "null";
        while (true){ // menu two loop
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                for (Airplane plane : listOfPlanes
                ) { // prints all planes
                    System.out.println(plane);
                }
            }
            else if (input.equals("2")) {
                for (Flight flight : listOfFlights
                ) { // prints all flights
                    System.out.println(flight);
                }
            }
            else if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                for (Airplane plane : listOfPlanes
                ) {
                    if (id.equals(plane.getId())) { // checks ID in planes list , if exist prints it
                        System.out.println(plane);
                    }
                    else { // if not exist , print this
                        System.out.println("No such plane");
                    }
                }
            }
            else if (input.equals("x")) {
                break;
            }
        }
    } // second menu logic



}
