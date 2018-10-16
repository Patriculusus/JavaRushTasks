package com.javarush.task.task01.task0131;


/*
Гадание на долларовый счет
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Are {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int buff = Integer.parseInt(reader.readLine());
            if (buff > max) max = buff;
        }

        System.out.println("max is " + max);
    }
}