package com.javarush.task.task14.task1419;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = null;
            System.out.println(a.charAt(9));

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int a[] = new int[5];
            a[6] = 9;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {


        } catch (Exception e) {
            exceptions.add(e);
        }

        try {


        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
