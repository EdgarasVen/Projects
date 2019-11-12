package org.mokykla.praktika.opp2;

public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return value%2==0;
    }
    public boolean isOdd(){
        return value%2!=0;
    }
    //Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя[1].
    // Другими словами, число x является простым,
    // если оно больше 1 и при этом делится без остатка только на 1 и на x.
    // К примеру, 5 — простое число, а 6 является составным числом, так как,
    // помимо 1 и 6, также делится на 2 и на 3.
    public boolean isPrime(){
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value){
        return value%2==0;
    }
    public static boolean isOdd(int value){
        return value%2!=0;
    }
    public static boolean isPrime( int value){
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger value){
        return value.getValue()%2==0;
    }
    public static boolean isOdd(MyInteger value){
        return value.getValue()%2!=0;
    }
    public static boolean isPrime(MyInteger value){
        int number = value.getValue();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
