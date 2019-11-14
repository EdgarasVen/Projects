package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("catFatherF");
        String fatherFName = reader.readLine();
        Cat catFatherF = new Cat(fatherFName);
        //System.out.println("catMotherM");
        String motherMName = reader.readLine();
        Cat catMotherM = new Cat(motherMName);

        //System.out.println("catFather");
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,null, catFatherF);
        //System.out.println("catMother");
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catMotherM, null);

        //System.out.println("catSon");
        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catMother , catFather);
        //System.out.println("catDaughter");
        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catFatherF);
        System.out.println(catMotherM);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentM;
        private Cat parentF;

        Cat(String name) {
            this.name = name;
        }


        Cat(String name, Cat parentM, Cat parentF){
            this.name = name;
            this.parentM = parentM;
            this.parentF = parentF;
        }

        @Override
        public String toString() {
            if ((parentM == null)&&(parentF == null))
                return "The cat's name is " + name + ", no mother ,no father";
            else if (parentF == null)
                return "The cat's name is " + name + ", mother is " + parentM.name+ ", no father";
                else if (parentM == null)
                return "The cat's name is " + name + ", no mother, father is " + parentF.name;
                else
                    return "The cat's name is " + name + ", mother is " + parentM.name+ ", father is "+parentF.name;
        }
    }

}
