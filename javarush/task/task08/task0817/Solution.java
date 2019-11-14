package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hm =new HashMap<String,String>();
        hm.put("Иванов", "Иван");
        hm.put("Иванидзе", "Иван");
        hm.put("Иваник", "Петр");
        hm.put("Петров", "Петр");
        hm.put("Петтов", "Сидр");
        hm.put("Прутков", "Петр");
        hm.put("Толстой", "Петр");
        hm.put("Тонкий", "Лев");
        hm.put("Пушкин", "Михаил");
        hm.put("Кукушкин", "Сергей");
        return hm;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        //HashMap<String,String> map =new HashMap<String,String>(createMap());
        //System.out.println(map);
        //removeTheFirstNameDuplicates(map);
        //System.out.println(map);
    }
}
