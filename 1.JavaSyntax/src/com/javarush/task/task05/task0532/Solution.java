package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int readCount = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());;

        for (int i = 0; i < readCount-1; i++) {
            int buff = Integer.parseInt(reader.readLine());
            if(buff > maximum) maximum = buff;
        }

        System.out.println(maximum);
    }
}
