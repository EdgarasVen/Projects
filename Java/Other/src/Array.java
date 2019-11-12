import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int [] num = new int[100000000];
        int [] num1 = new int[randomNumber(150)];
        int [] num2 = new int[randomNumber(150)];
        int [] num3 = new int[randomNumber(150)];
        int [] num4 = new int[randomNumber(150)];
        int [] num5 = new int[randomNumber(150)];


        addArray(num,164);
        addArray(num1,1001);
        addArray(num2,1001);
        addArray(num3,1001);
        addArray(num4,1001);
        addArray(num5,1001);


        int [] numC = num.clone();
        int [] num1C = num1.clone();
        int [] num2C = num2.clone();
        int [] num3C = num3.clone();
        int [] num4C = num4.clone();
        int [] num5C = num5.clone();
        /*for (Integer n: num) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (Integer n: numC) {
            System.out.print(n + " ");
        }*/
        System.out.println();
        Long start=System.currentTimeMillis();
        num=removeNumbersInArrayOptimized(num,num1);
        num=removeNumbersInArrayOptimized(num,num2);
        num=removeNumbersInArrayOptimized(num,num3);
        num=removeNumbersInArrayOptimized(num,num4);
        num=removeNumbersInArrayOptimized(num,num5);
        Long end=System.currentTimeMillis();
        System.out.println();
        //System.out.println("Array after removes");
        /*for (Integer n: num) {
            System.out.print(n+" ");
        }*/
        System.out.println("first finish");
        System.out.println("Time taken for work with optimization ="+(end-start));


        System.out.println();
        Long start2=System.currentTimeMillis();
        numC=removeNumbersInArray(numC,num1C);
        numC=removeNumbersInArray(numC,num2C);
        numC=removeNumbersInArray(numC,num3C);
        numC=removeNumbersInArray(numC,num4C);
        numC=removeNumbersInArray(numC,num5C);
        Long end2=System.currentTimeMillis();
        System.out.println();


        System.out.println("second finish");
        System.out.println("Time taken for work without optimization ="+(end2-start2));
    }
    public static int randomNumber(int value){
        Random rand = new Random();
       return rand.nextInt(value);
    }
    public static void addArray(int[] num,int value){
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i]=rand.nextInt(value);

        }
    }
    public static int[] removeNumbersInArrayOptimized(int[] arr, int [] arr2){
        int [] tempArray1 = new int [arr.length];
        arr2=arrayOptimizatio(arr,arr2);
        int countMinus=0;
        for (int i = 0, check=0 ,tempArrayCount=0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j]<0)
                    break;
                if (arr[i]==arr2[j]){
                    check++;
                    countMinus++;
                }
            }
            if(check<=0)
            tempArray1[tempArrayCount++]=arr[i];
            check=0;
        }
        //System.out.println("numbers same is "+countMinus);
        int [] tempArray2 = new int [arr.length-countMinus];
        for (int i = 0; i < tempArray2.length; i++) {
            tempArray2[i]=tempArray1[i];
        }
        return  tempArray2;
    }
    public static int[] arrayOptimizatio(int[] arr,int[] arr2){
        int max=arrayMax(arr);
        int count=0;
        int[] tempArray1 = new int[arr2.length];
        for (int i = 0, k=0; i < arr2.length; i++) {
            if (arr2[i]>max) {
                count++;
                continue;
            }
            tempArray1[k++] = arr2[i];
        }
        //System.out.println("count "+count);
        int [] tempArray2 = new int [arr2.length-count];
        for (int i = 0; i < tempArray2.length; i++) {
            tempArray2[i]=tempArray1[i];
        }
        return tempArray2;
    }
    public static int arrayMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (Integer in: arr) {
            if (in>max)
                max=in;
        }
        return max;
    }
    public static int[] removeNumbersInArray(int[] arr, int [] arr2){
        int [] tempArray1 = new int [arr.length];

        int countMinus=0;
        for (int i = 0, check=0 ,tempArrayCount=0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j]<0)
                    break;
                if (arr[i]==arr2[j]){
                    check++;
                    countMinus++;
                }
            }
            if(check<=0)
                tempArray1[tempArrayCount++]=arr[i];
            check=0;
        }
        //System.out.println("numbers same is "+countMinus);
        int [] tempArray2 = new int [arr.length-countMinus];
        for (int i = 0; i < tempArray2.length; i++) {
            tempArray2[i]=tempArray1[i];
        }
        return  tempArray2;
    }

}
