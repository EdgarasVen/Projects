package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    String name;
    public Cat(String name){
        this.name=name;
    }
    protected void finalize() throws Throwable{

    }
    public static void main(String[] args) {

    }
}
