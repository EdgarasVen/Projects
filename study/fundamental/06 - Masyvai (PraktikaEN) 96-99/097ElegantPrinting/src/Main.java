
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int i=0;
        for (Integer text:array){
            if (i==0)
            System.out.print(text);
            else
                System.out.print(", "+text);
            i++;
            // Write code here
        }
    }
}
