package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void  initialize(String name){
        this.name=name;
        this.age=10;
        this.weight=20;
        this.color="hex";

    }
    public void  initialize(String name,int age){
        this.name=name;
        this.age=age;
        this.weight=20;
        this.color="hex";
    }
    public void  initialize(int weight,String color){
        this.color=color;
        this.weight=weight;
        this.age=10;
    }
    public void  initialize(int weight,String color,String address){
        this.color=color;
        this.weight=weight;
        this.address=address;
        this.age=10;
    }
    public void  initialize(String name,int weight,int age){
        this.name=name;
        this.age=age;
        this.color="hex";
        this.weight=weight;


    }

    public static void main(String[] args) {

    }
}
