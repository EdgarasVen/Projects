package lambda2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Ex:1
        /*String[] array = {"bsadasad","esdasdas","eedas","eeeedsg","doios"};
        Arrays.sort(array, (o1,o2)-> o1.length()-o2.length());
        System.out.println(" ex 1 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, (o1,o2)-> o2.length()-o1.length());
        System.out.println(" ex 2 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, (o1,o2)-> o1.compareTo(o2));
        System.out.println(" ex 3 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array,(o1,o2)->{
            if (o1.contains("e") && o2.contains("e")) {
                int c1=0; int c2=0;
                for (int i = 0; i < o1.length(); i++) {
                    if(o1.charAt(i)=='e')  c1++;
                }
                for (int i = 0; i < o2.length(); i++) {
                    if(o2.charAt(i)=='e')  c2++;
                }
                return c2-c1;
            }
            if (o1.contains("e")) return -1;
            else return 1;
        } );
        System.out.println(" ex 4 >");
        System.out.println(Arrays.toString(array) +"\n");

        Arrays.sort(array, new ComparatorIFHaveE());
        System.out.println(" ex 5 >");
        System.out.println(Arrays.toString(array) +"\n");*/

        // Ex:2
        String string1 ="linux";
        String string2 ="windows";/*
        String longer=StringUtil.betterString(string1,string2,(st1,st2)-> st1.length()>st2.length());
        System.out.println(longer);
        String first = StringUtil.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(first);*/


        // Ex:3
        Car car1 = new Car(); car1.setPrice(12);
        Car car2 = new Car(); car2.setPrice(10);
        Employee employee1 = new Employee(); employee1.setSalary(100);
        Employee employee2 = new Employee(); employee2.setSalary(200);

        System.out.println(ElementUtils.betterElement(string1, string2, (s1, s2) -> s1.length() > s2.length()));
        System.out.println(ElementUtils.betterElement(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice()));
        System.out.println(ElementUtils.betterElement(employee1, employee2, (e1, e2) -> e1.getSalary() > e2.getSalary()));
    }
}
