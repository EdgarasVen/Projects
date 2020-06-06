
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        Informer info= new Informer(new OpenCsvReader(scan.nextLine()));
        info.printResult(scan.nextLine());
    }

}
