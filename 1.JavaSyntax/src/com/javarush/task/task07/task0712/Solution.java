package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) max = list.get(i).length();
            if (list.get(i).length() < min) min = list.get(i).length();
        }

        for (String s : list) {
            if(s.length() == max || s.length() == min){
                System.out.println(s);
                break;
            }
        }
    }
}
