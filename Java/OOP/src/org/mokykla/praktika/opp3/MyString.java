package org.mokykla.praktika.opp3;

public class MyString {
    private char[] chars;
    private int length;
        /* String sr;*/
        /*sr.length();
        sr.charAt(1);
        sr.substring(1,3);
        sr.toLowerCase();
        sr.equals("ss");
        sr.valueOf(1);*/

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
        String st = "";
        char[] ch = string.toCharArray();
        for (int i = begin; i < end; i++) {
            st+=ch[i];
        }
        return st;
    }
}
