package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "loser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Loser.
3.3. Вызывает метод writeCode(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        List<String> words = new ArrayList<>();
        words.add("user");
        words.add("loser");
        words.add("coder");
        words.add("proger");

        while(true){
            key = reader.readLine();

            if(words.contains(key)) {
                if ("user".equals(key)) person = new Person.User();
                if ("loser".equals(key)) person = new Person.Loser();
                if ("coder".equals(key)) person = new Person.Coder();
                if ("proger".equals(key)) person = new Person.Proger();

                doWork(person);
            }
            else break;
        }

        //тут цикл по чтению ключей, пункт 1
//        {
            //создаем объект, пункт 2

//            doWork(person); //вызываем doWork

//        }
    }

    public static void doWork(Person person) {
        // пункт 3

        if(person instanceof Person.User) ((Person.User) person).live();
        if(person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if(person instanceof Person.Coder) ((Person.Coder) person).writeCode();
        if(person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
