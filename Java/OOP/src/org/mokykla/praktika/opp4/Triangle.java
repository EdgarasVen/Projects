package org.mokykla.praktika.opp4;

public class Triangle extends Shape {

    private double sideA=1.0;
    private double sideB=1.0;
    private double sideC=1.0;
    private double angleAB=60.0;
    private double angleBC=60.0;
    private double angleCA=60.0;

    public Triangle(){

    }
    public Triangle(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;


    }

}
