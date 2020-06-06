import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return (sum);
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double av= list.size();
        return sum(list)/av;
    }
    // ((3 - 3.5)2 + (2 - 3.5)2 + (7 -3.5)2 + (2 - 3.5)2)/(4 - 1)
    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg=average(list);
        return (Math.pow((3 - 3.5),2) + Math.pow((2 - 3.5),2) + Math.pow((7 -3.5),2) + Math.pow((2 - 3.5),2)/(4 - 1));
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
