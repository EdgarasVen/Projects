package org.mokykla.praktika.Shapes;

public class Rectangle extends Shape {
    private double windth=1.0;
    private double length=1.0;

    public Rectangle(){

    }
    public Rectangle(double windth, double length){
        this.windth=windth;
        this.length=length;
    }
    public Rectangle(double windth, double length,String color, boolean filled){
        this.windth=windth;
        this.length=length;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getWindth() {
        return windth;
    }

    public void setWindth(double windth) {
        this.windth = windth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle with windth= " + windth + ", length=" + length + " which is a subclass of "+ super.toString();
    }
    @Override
    public double getArea(){
        return windth*length;
    }

    public double getSide() {
        return length;
    }

    @Override
    public double getPerimeter(){
        return (2*windth)+(2*length);
    }
}
