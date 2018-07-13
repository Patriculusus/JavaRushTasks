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

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat grandFather = new Cat(grandFatherName);
        Cat grandMother = new Cat(grandMotherName);
        Cat father = new Cat(fatherName, null, grandFather);
        Cat mother = new Cat(motherName, grandMother, null);
        Cat son = new Cat(sonName, mother, father);
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

//        Cat(String name, Cat parent) {
//            this.name = name;
//            if (name.contains("мама")) this.parentMother = parent;
//            if (name.contains("папа")) this.parentFather = parent;
//        }


        Cat(String name, Cat parentMother, Cat parentFather) {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            String result = "Cat name is " + name;
            if (parentMother == null)
                result += ", no mother";
            else
                result +=  ", mother is " + parentMother.name;

            if (parentFather == null)
                result += ", no father";
            else
                result +=  ", father is " + parentFather.name;

            return result;
        }
    }

}
