package lambda2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"bsadasad","esdasdas","eedas","eeeedsg","doios"};
        Arrays.sort(array, (o1,o2)-> o1.length()-o2.length());
        System.out.println(" ex 1 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, (o1,o2)-> o2.length()-o1.length());
        System.out.println(" ex 2 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, (o1,o2)-> o1.compareTo(o2));
        System.out.println(" ex 3 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array,(o1,o2)->{
            if (o1.contains("e") && o2.contains("e")) {
                int c1=0; int c2=0;
                for (int i = 0; i < o1.length(); i++) {
                    if(o1.charAt(i)=='e')  c1++;
                }
                for (int i = 0; i < o2.length(); i++) {
                    if(o2.charAt(i)=='e')  c2++;
                }
                return c2-c1;
            }
            if (o1.contains("e")) return -1;
            else return 1;
        } );
        System.out.println(" ex 4 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, new ComparatorIFHaveE( ));
        System.out.println(" ex 5 >");
        System.out.println(Arrays.toString(array) +"\n");
    }

}
