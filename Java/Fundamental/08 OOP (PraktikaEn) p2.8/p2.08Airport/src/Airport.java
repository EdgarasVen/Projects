import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Airplane> listOfPlanes;
    public ArrayList<Flight> listOfFlights;
    public Airport (){
        listOfPlanes= new ArrayList<>();
        listOfFlights= new ArrayList<>();
    }
    public void printMenuOne(){
        System.out.println("Choose operation:");
        System.out.println("[1] Add plane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    } // just print menu
    public void printMenuTwo(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    } // just print second menu
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
    private void menuOne(){
        String input = "null";
        while (true){
            printMenuOne();
            input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give plane capacity: ");
                int cap = Integer.parseInt(scanner.nextLine());
                listOfPlanes.add(new Airplane(id, cap));
            }
            else if (input.equals("2")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                for (Airplane plane : listOfPlanes
                ) {
                    if (id.equals(plane.getId())) {
                        System.out.println("Give departure airport code: ");
                        String dep = scanner.nextLine();
                        System.out.println("Give destination airport code: ");
                        String des = scanner.nextLine();
                        listOfFlights.add(new Flight(plane, dep, des));
                    }
                    else {
                        System.out.println("No such plane");
                    }
                }
                for (Flight flight: listOfFlights
                     ) {
                    System.out.println(flight);
                }
            }
            else if (input.equals("x")) {
                break;
            }
        }
    } // first menu logic
    private void menuTwo() {
        String input = "null";
        while (true){
            printMenuTwo();
            input = scanner.nextLine().toLowerCase();
            if (input.equals("1")) {
                for (Airplane plane : listOfPlanes
                ) {
                    System.out.println(plane);
                }
            }
            else if (input.equals("2")) {
                for (Flight flight : listOfFlights
                ) {
                    System.out.println(flight);
                }
            }
            else if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                for (Airplane plane : listOfPlanes
                ) {
                    if (id.equals(plane.getId())) {
                        System.out.println(plane);
                    }
                }
            }
            else if (input.equals("x")) {
                break;
            }
        }
    } // second menu logic



}
