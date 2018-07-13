package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int lesLength = strings.get(0).length();
        for (int i = 0; i < 2; i++) {
            for (String aList : strings) {
                if (i == 0) {
                    if (aList.length() < lesLength) lesLength = aList.length();
                } else {
                    if (aList.length() == lesLength) System.out.println(aList);
                }
            }
        }
    }
}
