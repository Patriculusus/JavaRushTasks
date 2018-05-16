package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(max(a,b,c) + " " + average(a,b,c) + " " + min(a,b,c));
    }

    private static int max(int a, int b, int c){
        if(a>=b && a>=c) return a;
        else if(b>=a && b>=c) return b;
        else return c;
    }

    private static int average(int a, int b, int c){
        if((a<=b && a>=c) || (a>=b && a<=c)) return a;
        else if((b<=a && b>=c) || (b>=a && b<=c)) return b;
        else return c;
    }

    private static int min(int a, int b, int c){
        if(a<=b && a<=c) return a;
        else if(b<=a && b<=c) return b;
        else return c;
    }
}
