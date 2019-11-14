package com.javarush.task.task08.task0815;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> hm =new HashMap<String,String>();
        hm.put("Иванов", "Иван");
        hm.put("Иванидзе", "Иван");
        hm.put("Иваник", "Петр");
        hm.put("Петров", "Петр");
        hm.put("Петров", "Сидр");
        hm.put("Прутков", "Петр");
        hm.put("Толстой", "Петр");
        hm.put("Тонкий", "Лев");
        hm.put("Пушкин", "Михаил");
        hm.put("Кукушкин", "Сергей");
        return hm;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код

        return Collections.frequency(map.values(),name);
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {

        return Collections.frequency(map.keySet(),lastName);
    }

    public static void main(String[] args) {
        HashMap map =new HashMap(createMap());
        System.out.println(map);
        System.out.println(getCountTheSameLastName(map,"Петров"));
        System.out.println(getCountTheSameFirstName(map,"Петр"));

        //System.out.println(Collections.frequency(map.keySet(),"pavardenis"));
        }

    }

