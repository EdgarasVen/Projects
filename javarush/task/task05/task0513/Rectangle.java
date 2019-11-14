package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top,int left,int width,int height){
        this.height=height;
        this.left=left;
        this.top=top;
        this.width=width;
    }
    public void initialize(int top,int left){

        this.left=left;
        this.top=top;

    }
    public void initialize(int top,int left,int height){
        this.height=height;
        this.left=left;
        this.top=top;

    }
    public void initialize(int height){
        this.height=height;

    }

    public static void main(String[] args) {

    }
}
