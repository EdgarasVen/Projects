package org.mokykla.praktika.main;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.mokykla.praktika.opp.Account;
import org.mokykla.praktika.opp.Circle;
import org.mokykla.praktika.opp.Date;
import org.mokykla.praktika.opp.Time;
import org.mokykla.praktika.opp2.MyInteger;
public class Solution {
    public static void main(String[] args) {

        System.out.println(MyInteger.isPrime(3));
    }


    public static double round(double n) {
        return Math.floor(n * Math.pow(10, 2)) / Math.pow(10, 2);
    }
}
