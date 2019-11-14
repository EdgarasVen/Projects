package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String,String > map = new HashMap<>();
        map.put("pavarde","vardas");
        map.put("pavarde1","vardas1");
        map.put("pavarde2","vardas2");
        map.put("pavarde3","vardas3");
        map.put("pavarde4","vardas3");
        map.put("pavarde5","vardas5");
        map.put("pavarde1","vardas6");
        map.put("pavarde7","vardas6");
        map.put("pavarde8","vardas8");
        map.put("pavarde9","vardas9");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
