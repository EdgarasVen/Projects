package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int top,int left,int width,int height){
        this.height=height;
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public Rectangle(int top,int left){

        this.left=left;
        this.top=top;

    }
    public Rectangle(int top,int left,int height){
        this.height=height;
        this.left=left;
        this.top=top;

    }
    public Rectangle(int height){
        this.height=height;

    }
    public static void main(String[] args) {

    }
}
