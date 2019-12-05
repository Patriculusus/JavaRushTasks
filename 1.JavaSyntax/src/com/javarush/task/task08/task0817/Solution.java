package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Dark0", "King");
        map.put("Dark1", "Twister");
        map.put("Dark2", "Twister");
        map.put("Black0", "King");
        map.put("Black1", "Twister");
        map.put("Black2", "Mandy");
        map.put("Sidius", "King");
        map.put("Rock", "Mandy");
        map.put("Abrams", "Mandy");
        map.put("Furtado", "Twister");

        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> lst = new ArrayList<String>(map.values());

        int count;
        for (String str : lst) {
            count = 0;
            for (String str2 : lst) {
                if (str.equals(str2))
                    count++;
                if (count==2) removeItemFromMapByValue (map, str);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
