package org.mokykla.praktika.main;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.mokykla.praktika.opp.Account;
import org.mokykla.praktika.opp.Circle;
import org.mokykla.praktika.opp.Date;
import org.mokykla.praktika.opp.Time;
import org.mokykla.praktika.opp2.MyInteger;
public class Solution {
    public static void main(String[] args) {
        String number = "123";
        char[] digits = { '1', '2', '3','4','5' };
        System.out.println(MyInteger.parseInt(number));
        System.out.println(Integer.parseInt(String.valueOf(digits)));
        System.out.println(MyInteger.parseInt(digits));
    }


    public static double round(double n) {
        return Math.floor(n * Math.pow(10, 2)) / Math.pow(10, 2);
    }
}
