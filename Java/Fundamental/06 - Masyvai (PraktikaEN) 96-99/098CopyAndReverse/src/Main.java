import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

// print
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] reverseCopy(int[] original) {
        int[] arr = new int[original.length];
        int j = original.length-1;
        for (int i = 0; i < original.length; i++) {
            arr[j]= original[i];
            j--;
        }
        return arr;
    }

    public static int[] copy(int[] original) {
        int[] arr = new int[original.length];
        for (int i = 0; i < original.length; i++) {
           arr[i]= original[i];
        }
        return arr;
    }

}
