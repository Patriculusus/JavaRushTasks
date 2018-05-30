package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numb = reader.readLine();

        for (int i = 0; i < numb.length(); i++){
            int buff = Integer.parseInt("" + numb.charAt(i));
            if(buff%2==0) even++;
            else odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
