import java.util.Scanner;

public class UI {
    Scanner scanner =new Scanner(System.in);

    public void start(){
        while (true){
            System.out.println(" Please input number no1");
            String number1= scanner.nextLine();
            System.out.println(" Please input number no2");
            String number2= scanner.nextLine();

            Parameters parametersA = new Parameters(number1, "16807", "2147483647",1000000);
            Parameters parametersB = new Parameters(number2, "48271", "2147483647",1000000);

            int result =new Comparator().compareByLastBinaryDigits(
                    new DigitsProvider().generateListOfDigits(parametersA),
                    new DigitsProvider().generateListOfDigits(parametersB),
                    8);

            System.out.println("With parameters "+number1+" and "+number2+" the result is "+result);
        }

    }
}
