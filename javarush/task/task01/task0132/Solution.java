package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a,b,c;
       c=number%10;
       b=(number/10)%10;
       a=number/100;


        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        number= a+b+c;
        return number;
    }
}