package org.mokykla.praktika.Cirkle2D;

public class Circle2D {
    private double x;
    private double y;
    private double radius;



    public Circle2D (){
        x=0;
        y=0;
        radius=1;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Circle2D (double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimetr() {
        return Math.PI*radius*2;
    }
    public boolean contains(double x,double y) {
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y))<=radius;
    }
    public boolean contains(Circle2D circle) {
        double x2=circle.getX(),y2=circle.getY();
        double distance=Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
            return distance<=radius-circle.getRadius();
    }
    public boolean overlaps(Circle2D circle) {
        double x2=circle.getX(),y2=circle.getY();
        double distance=Math.sqrt((x-x2)*(x-x2)+(y-y2)*(y-y2));
            return distance<=radius+circle.getRadius();
    }
}
