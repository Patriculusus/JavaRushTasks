package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int count1 = 1;

        while(count1 <= 10){
            int count2 = 1;
            while(count2 <= 10){
                System.out.print(count1*count2);
                if(count2 < 10) System.out.print(" ");
                else System.out.println();
                count2++;
            }
            count1++;
        }

    }
}
