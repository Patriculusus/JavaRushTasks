package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(reader.readLine());

        if(numb==0) System.out.println(numb);
        else if(numb<0) System.out.println(numb+1);
        else System.out.println(numb*2);
    }

}