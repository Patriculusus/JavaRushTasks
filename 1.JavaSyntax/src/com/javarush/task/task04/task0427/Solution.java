package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numb = Integer.parseInt(reader.readLine());
String result = "";
        if(numb%2==0) result += "четное ";
        else result += "нечетное ";

        if(numb<10) result += "однозначное число";
        else if(numb<100) result += "двузначное число";
        else if(numb<1000)result += "трехзначное число";

        if(numb>0 && numb<1000) System.out.println(result);
    }
}
