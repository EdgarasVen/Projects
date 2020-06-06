package org.mokykla.praktika.MyInt;

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
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger value){
        return this.value == value.getValue();
    }
    public static int parseInt(char[] a){
        int result=0;
        for(int i=0;i<a.length;i++){
            result=result*10+((int)a[i]-48);

        }
        return result;
    }
    public static int parseInt(String a) {
        return parseInt(a.toCharArray());
    }
}
