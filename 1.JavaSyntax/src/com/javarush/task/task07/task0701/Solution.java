package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int [] arrNumb = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<arrNumb.length; i++){
            arrNumb[i] = Integer.parseInt(reader.readLine());
        }
        return arrNumb;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int anArray : array) {
            if (anArray > max) max = anArray;
        }
        return max;
    }
}
