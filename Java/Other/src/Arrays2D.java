import java.util.ArrayList;
import java.util.Arrays;
class Arrays2D {
    private static double getRandomNumber(){
        double x = Math.random();
        x = x * 100 + 1;
        return (int) x;
    }
    private static void addNumber(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = getRandomNumber();
            }
        }
    }
    public static double searchMax(double[][] arr) {
        Double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (max<arr[i][j])
                    max=arr[i][j];
            }
        }
        //System.out.println("Max number is: "+max);
        return max;
    }
    public static double rowSum(double[][] arr, int x){
        Double sum = 0.0;
            for (int j = 0; j < arr[0].length; j++) {
                sum= sum + arr[x][j];
            }
        //System.out.println("Sum of row X="+x+" is: "+sum);
            return sum;
    }
    public static double columnSum(double[][] arr, int x){
        Double sum = 0.0;
        for (int j = 0; j < arr[0].length; j++) {
            sum= sum + arr[j][x];
        }
        //System.out.println("Sum of column Y="+x+" is: "+sum);
        return sum;
    }
    public static double diagonalSum(double[][] arr){
        double sum= 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum=sum +arr[i][i];
        }
        return sum;
    }
    public static double allRowSums(double[][] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+rowSum(arr,i);
        }
        //System.out.println("Sum of all rows is: "+sum);
        return sum;
    }
    public static double allColumnSums(double[][] arr){
        double sum=0;
        for (int i = 0; i < arr[0].length; i++) {
            sum=sum+columnSum(arr,i);
        }
        //System.out.println("Sum of all columns is: "+sum);
        return sum;
    }
    public static double allDiagonalSum(double[][] arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+ arr[i][i];
        }
        int j=0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            sum=sum+ arr[j][i];
            j++;
        }
        return sum;
    }
    public static boolean isRowMagic(double[][] arr){
        return allRowSums(arr) / arr.length == rowSum(arr, 0);
    }
    public static boolean isColumnMagic(double[][] arr){
        return allColumnSums(arr) / arr[0].length == columnSum(arr, 0);
    }
    public static boolean isDiagonalMagic(double[][] arr){
        return allDiagonalSum(arr) / 2 == diagonalSum(arr);
    }
    public static boolean isSquare(double[][] arr){
        return arr.length==arr[0].length;
    }
    public static boolean isMagic(double[][] arr){
        return isRowMagic(arr) && isColumnMagic(arr) && isDiagonalMagic(arr);
    }
    public static boolean isLatinRows(double[][] arr){
        int latin=0;
        for (int i = 1; i <= arr.length; i++) {
            latin=latin+i;
        }
        return allRowSums(arr) == latin * arr.length;
    }
    public static boolean isLatinColumns(double[][] arr){
        int latin=0;
        for (int i = 1; i <= arr[0].length; i++) {
            latin=latin+i;
        }
        return allColumnSums(arr) == latin * arr[0].length;
    }
    public static boolean isLatin(double[][] arr){
        return isLatinColumns(arr)&&isLatinRows(arr)&&isSquare(arr);
    }
    public static boolean isSequence(double[][] arr){
        double [][] array =new double[arr.length][arr.length];
        int k=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                array[i][j]=k;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        return isSquare(arr) && Arrays.deepEquals(arr,array);
    }

    public static void main(String[] args) {
        double [][] random = new double[3][3]; // random array from 0 to 100
        addNumber(random);
        double [][] latin ={{1, 2, 3, 4}, // custom array for latin test
                             {2, 1, 4, 3},
                             {3, 4, 1, 2},
                             {4, 3, 2, 1}  };
        double [][] sequence ={{1,   2,   3,  4}, // custom array for sequence test
                               {5,   6,   7,  8},
                               {9,   10, 11, 12},
                               {13,  14, 15, 16}  };
        System.out.println(Arrays.deepToString(random)); // prints random array.

        // write here your method
        }// main driver
}
