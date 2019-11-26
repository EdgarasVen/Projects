package org.mokykla.praktika.opp4;

public class Square extends Rectangle {
    public Square(){

    }
    public Square(double side){
        super.setLength(side);
        super.setWindth(side);
    }
    public Square(double side,String color,boolean filled){
        super.setLength(side);
        super.setWindth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    @Override
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
