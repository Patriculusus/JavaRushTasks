package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.


Требования:
1. Программа не должна считывать значения с клавиатуры.
2. В методе addCatsToMap() объяви переменную коллекции HashMap с типом элементов String, Cat и сразу проинициализируй ee.
3. Метод addCatsToMap() должен добавлять в коллекцию всех котов из массива String[] cats, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        HashMap<String, Cat> map = new HashMap<>();
        for(String s:cats){
            map.put(s, new Cat(s));
        }
        return map;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}