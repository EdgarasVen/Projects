import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        String[] words  ={"aassdd","llmmg","asfshgoeboeobeobvfkwbdbwbefrbwofdfbwkvfbwbfvbeworvbewfvevoevjnf"};
        calculateChar(words);
    }
    public static int charakterCount(String[] arr, char a){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == a)
                    count++;
            }
        }
        return count;
    }
    public static ArrayList<Character> stringToArrayList(String[]arr) {
        ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length(); j++) {
                    list.add(arr[i].charAt(j));
                }
            }
        return list;
    }
    public static void  calculateChar (String[]word){
        System.out.println();
        ArrayList<Character> arr = new ArrayList<>();
        arr=stringToArrayList(word);
        Collections.sort(arr);
        int count=1;
        for (int i = 0; i < arr.size(); i++) {
            if (i==arr.size()-1) {
                System.out.println(arr.get(i) + " = " + count);
                break;
            }
                if (arr.get(i)==(arr.get(i+1))){
                    count++;
                }
                else {
                    System.out.println( arr.get(i)+" = "+ count);
                    count=1;
                }
        }

    }
}
