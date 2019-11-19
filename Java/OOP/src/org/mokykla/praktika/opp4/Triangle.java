package org.mokykla.praktika.opp4;

public class Triangle extends Shape {
    private double sideC=1.0;
    private double sideA=1.0;
    private double sideB=1.0;


    public Triangle(){

    }
    public Triangle(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    public Triangle(double sideA,double sideB,double sideC, String color, boolean filled){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    @Override
    public double getArea (){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - sideA) * (p - sideB) * (p - sideC)));
    }

    public double getPerimeter(){
        return sideA+sideC+sideB;
    }

    @Override
    public String toString() {
        return "Triangle with sides: sideC= " + sideC + ", sideA= " + sideA + ", sideB=" + sideB + " which is a subclass of "+ super.toString();
}
}
