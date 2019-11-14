package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
   int age;
   char sex;
   String name;

   public Friend(String name,int age,char sex){
       this.age= age;
       this.name= name;
       this.sex=sex;
   }
    public Friend(String name,int age){
        this.age= age;
        this.name= name;

    }
    public Friend(String name){

        this.name= name;

    }

    public static void main(String[] args) {

    }
}
