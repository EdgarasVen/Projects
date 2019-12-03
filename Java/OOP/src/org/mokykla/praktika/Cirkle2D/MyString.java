package org.mokykla.praktika.Cirkle2D;

import java.util.Locale;

public class MyString {
    private char[] chars;
    private int length;


    public MyString(){

    }
    public MyString(String string){
        if (string.length()==0) return;
        else {
            chars = string.toCharArray();
            length = string.length();
        }
    }
    public MyString(char[] chars){
        this.chars = chars;
        length = chars.length;
    }
    public static char charAt(String string,int index){
        return string.toCharArray()[index-1];
    }
    public static int length(String string){
        int count =0;
        char[] ch = string.toCharArray();
        for (char charakter:ch) {
            count++;
        }
        return count;
    }
    public static String substring(String string,int begin,int end){
        StringBuilder st = new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = begin; i < end; i++) {
            st.append(ch[i]);
        }
        return st.toString();
    }
    public static String substring(String string,int begin){
        StringBuilder st = new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = begin; i < ch.length; i++) {
            st.append(ch[i]);
        }
        return st.toString();
    }
    public static String toLowerCase (String string){
        StringBuilder st = new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            int unicode=(int)ch[i];
            if(unicode>=65 && unicode<=90)  unicode=unicode+32;
            st.append((char)unicode);
        }
        return st.toString();
    }
    public static String toUpperCase (String string){
        StringBuilder st = new StringBuilder();
        char[] ch = string.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            int unicode=(int)ch[i];
            if(unicode>=97 && unicode<=122)  unicode=unicode-32;
            st.append((char)unicode);
        }
        return st.toString();
    }
    public static boolean equals(String string, String otherString){
        if(string.length()!=otherString.length())
            return false;
        int sum=0,sum2=0;
        char[] ch = string.toCharArray();
        char[] ch2 = otherString.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sum+=(int)ch[i];
        }
        for (int i = 0; i < ch2.length; i++) {
            sum2+=(int)ch2[i];
        }
        return sum==sum2;
    }
    public static String valueOf(int i){
       return Integer.toString(i);
    }
    public static boolean compare(String string,String otherString){

        return false;
    }
}
