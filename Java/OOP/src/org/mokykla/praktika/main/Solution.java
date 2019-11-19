package org.mokykla.praktika.main;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.mokykla.praktika.opp.Account;
import org.mokykla.praktika.opp.Date;
import org.mokykla.praktika.opp.Time;
import org.mokykla.praktika.opp2.MyInteger;
import org.mokykla.praktika.opp3.MyString;
import org.mokykla.praktika.opp4.*;

import java.util.ArrayList;

public class Solution {




    public static <shape> void main(String[] args) {

        ArrayList <Shape> list = new ArrayList<>();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();


        list.add(circle);
        list.add(triangle);
        list.add(square);
        list.add(rectangle);

        for (Shape shape:list) {
            System.out.println(shape.toString());
        }

        //  visu plociu suma
        double sumOfArea=0;
        for (Shape shape:list) {
            sumOfArea+=((Shape)shape).getArea();
        }
        System.out.println("Sum of all areas is : ");
        System.out.println(sumOfArea);

    }



}
