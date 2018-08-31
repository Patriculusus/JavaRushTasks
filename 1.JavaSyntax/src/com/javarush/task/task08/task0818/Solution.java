package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
4. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Momo", 666);
        map.put("Lolo", 555);
        map.put("Popo", 444);
        map.put("Sand", 777);
        map.put("Lara", 333);
        map.put("King", 888);
        map.put("Nemo", 222);
        map.put("Lory", 999);
        map.put("Chan", 1123);
        map.put("Leya", 124);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        map.entrySet().removeIf(item -> item.getValue() < 500);
    }

    public static void main(String[] args) {
//        HashMap<String, Integer> map = createMap();
//        System.out.println(map);
//        removeItemFromMap(map);
//        System.out.println(map);
    }
}