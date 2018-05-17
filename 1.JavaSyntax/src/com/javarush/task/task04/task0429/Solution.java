package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int positiveCounter = 0;
        int negativeCounter = 0;

        if (a > 0) positiveCounter++;
        else if (a != 0) negativeCounter++;
        if (b > 0) positiveCounter++;
        else if (b != 0) negativeCounter++;
        if (c > 0) positiveCounter++;
        else if (c != 0) negativeCounter++;

        System.out.println("количество отрицательных чисел: " + negativeCounter);
        System.out.println("количество положительных чисел: " + positiveCounter);

    }
}
