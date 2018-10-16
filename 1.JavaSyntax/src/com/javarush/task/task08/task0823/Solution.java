package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] words = s.trim().split(" ");

        ArrayList<String> list = new ArrayList();

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(" ") && words[i].length() != 0) list.add(words[i]);
        }

//        System.out.println(list.size());
//
//        System.out.println("--------------------------");
//
//        for (String ss : list) {
//            System.out.println(ss + " " + ss.length());
//        }
//        System.out.println("--------------------------");

        for (int i = 0; i < list.size(); i++) {
            String firstChar = list.get(i).trim().substring(0, 1).toUpperCase();
            list.set(i, (firstChar + list.get(i).trim().substring(1)));
            System.out.println(list.get(i));
        }
    }
}
