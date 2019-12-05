package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк

Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
ArrayList<String> list = new ArrayList<>();
list.add("Bla bla bla");
        ArrayList<String>[] mas = new ArrayList[2];
        mas[0] = list;
        mas[1] = list;
        return mas;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}