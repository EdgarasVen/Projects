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
        ArrayList<Shape> list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Rectangle());
        list.add(new Square());
        list.add(new Triangle());

        for (Shape shape: list) {
            System.out.println(shape.toString());
        }
        System.out.println();
        for (Shape shape: list) {
            System.out.println(shape.getArea());
        }
    }

}
