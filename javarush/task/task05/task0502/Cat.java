package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

        int advantage=Integer.compare(this.age,anotherCat.age) +
                Integer.compare(this.weight,anotherCat.weight) +
                Integer.compare(this.strength,anotherCat.strength);
        return advantage>0?true:false;
    }

    public static void main(String[] args) {


    }
}
