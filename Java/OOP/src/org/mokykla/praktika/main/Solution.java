package org.mokykla.praktika.main;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.mokykla.praktika.opp.Account;
import org.mokykla.praktika.opp.Circle;
import org.mokykla.praktika.opp.Date;
import org.mokykla.praktika.opp.Time;
import org.mokykla.praktika.opp2.MyInteger;
import org.mokykla.praktika.opp4.Square;

public class Solution {
    public static void main(String[] args) {

        double angle = 45;
        double radian = Math.toRadians(angle);
        double cos = Math.cos(radian);
        System.out.println(Math.toRadians(angle));
        System.out.println(Math.toDegrees(radian));
        System.out.println(Math.cos(radian));
        System.out.println(Math.sinh(cos));

    }



}
