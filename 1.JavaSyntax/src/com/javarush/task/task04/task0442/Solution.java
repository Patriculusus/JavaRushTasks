package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int summ = 0;
        int imputedNumb = 0;

        while (imputedNumb!=-1){
            imputedNumb = Integer.parseInt(reader.readLine());
            summ += imputedNumb;
        }
        System.out.println(summ);
    }
}
