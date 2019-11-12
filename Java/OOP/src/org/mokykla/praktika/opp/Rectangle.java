package org.mokykla.praktika.opp;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Rectangle(float length, float width){
        this.length = length;
        this.width= width;
    }

    public float getArea(){
        return width*length;
    }

    public float getPerimeter(){
        return width*length*2;
    }

    public String toString(){
        return  "Rectangle [ length= "+length+" width= "+width+" ]";
    }

}
