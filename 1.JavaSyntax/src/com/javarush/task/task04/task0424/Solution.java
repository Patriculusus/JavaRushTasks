package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a != b && a != c && b!=c)  {
        } else {
            if (a != b && a != c) System.out.println(1);
            else if (a != b && b != c) System.out.println(2);
            else if (c != b && a != c) System.out.println(3);
        }
    }
}
