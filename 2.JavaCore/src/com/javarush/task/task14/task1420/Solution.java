package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = 0;
        int i2 = 0;

        try {
            i1 = Integer.parseInt(reader.readLine());
            i2 = Integer.parseInt(reader.readLine());
        }catch (Exception e){
            System.out.println(e);
        }

        List<Integer> i1Deviders = new ArrayList<>();
        List<Integer> i2Deviders = new ArrayList<>();

        for (int i = 1; i <= i1; i++) {
            if (i1 % i == 0) i1Deviders.add(i);
        }

        for (int i = 1; i <= i2; i++) {
            if (i2 % i == 0) i2Deviders.add(i);
        }

        int result = 1;
        for (int r : i1Deviders) {
            if (i2Deviders.contains(r)) result = r;
        }

        System.out.println("i1Deviders\n");
        i1Deviders.forEach(System.out::println);

        System.out.println("\ni2Deviders\n");
        i2Deviders.forEach(System.out::println);

        System.out.println("result = " + result);
    }
}
