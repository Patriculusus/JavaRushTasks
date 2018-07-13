package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] intArr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < intArr.length; i++) {
            if (i < arr1.length) arr1[i] = intArr[i];
            else arr2[i - arr1.length] = intArr[i];
        }

        for (int elem : arr2) {
            System.out.println(elem);
        }
    }
}
