package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 =new Man ("1",20,"a1");
        Man man2 =new Man ("2",21,"a2");
        Woman w1 =new Woman ("3",20,"w1");
        Woman w2 =new Woman ("4",21,"w2");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(w1);
        System.out.println(w2);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;

    }
        public String toString(){
            return name + " " + age + " " + address;
        }
    //напишите тут ваш код
}}
