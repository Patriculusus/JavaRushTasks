package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int input = 0;
        int counter = 0;

        while(input != -1){
            input = Integer.parseInt(reader.readLine());
            if(input == -1) break;
            else {
                sum += input;
                counter++;
            }
        }

        System.out.println((double)sum/counter);
    }
}

