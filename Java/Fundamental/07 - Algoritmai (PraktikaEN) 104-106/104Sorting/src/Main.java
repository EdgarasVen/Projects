import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static  int smallest (ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<min){
                min=list.get(i);
                }
        }
        return min;
    }
    public static int indexOfSmallest (ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<min){
                min=list.get(i);
                index = i;}
        }
        return index;
    }
    public static  int indexOfTheSmallestStartingFrom(ArrayList<Integer> list, int in) {
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = in; i < list.size(); i++) {
            if (list.get(i)<min){
                min=list.get(i);
                index = i;}
        }
        return index;
    }
    public static void swap (ArrayList<Integer> list, int index1,int index2){
        int tempNumber;
        tempNumber=list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,tempNumber);
    }
    public static void sort (ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            swap(list,i,indexOfTheSmallestStartingFrom(list,i));
        }
    }

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(8);
        sort(list);
        for (Integer s: list) {
            System.out.println(s);
        }

    }

}
