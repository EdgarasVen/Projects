package org.mokykla.praktika.Shapes;


import java.util.ArrayList;

public class MainClass {
    public static <shape> void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Rectangle());
        list.add(new Square());
        list.add(new Triangle());
        double suma = 0;
        double max=0;

        for (Shape shape: list) {
            System.out.println(shape.toString());
        }
        System.out.println();
        for (Shape shape: list) {
            suma+=shape.getArea();
        }
        System.out.println(suma);

        System.out.println();
        for (Shape shape: list) {
            if (max<shape.getPerimeter())
                max=shape.getPerimeter();
            System.out.println(shape.getPerimeter());
        }

        System.out.println("max perimetr= "+max);

        StringBuilder stringBuilder = new StringBuilder();
        for (Shape trans: list
             ) {
            stringBuilder.append(trans.toString()+"\n");
        }
        System.out.println("-----");
        System.out.println(stringBuilder.toString());
    }
}
