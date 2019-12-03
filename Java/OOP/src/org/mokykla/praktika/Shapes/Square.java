package org.mokykla.praktika.Shapes;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWindth(side);
    }

    @Override
    public String toString() {
        return "Square with side= "+super.getLength()+ " which is subclass of "+super.toString();
    }
}
