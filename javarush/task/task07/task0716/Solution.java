package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //Delete word contain "р"
        for (int i = strings.size()-1; i>=0; i--) {
            if (strings.get(i).indexOf("р")>=0 && strings.get(i).indexOf("л")==-1)
                strings.remove(i);
        }
        //Duplicate word with "л"
        for (int i = strings.size()-1; i>=0; i--) {
            if (strings.get(i).indexOf("л")>=0 && strings.get(i).indexOf("р")==-1)
                strings.add(strings.get(i));
        }
        //напишите тут ваш код
        return strings;
    }
}