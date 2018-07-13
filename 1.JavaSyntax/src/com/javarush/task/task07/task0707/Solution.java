package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<5; i++){
            list.add("BMW " + i);
        }

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));;
        }
    }
}
