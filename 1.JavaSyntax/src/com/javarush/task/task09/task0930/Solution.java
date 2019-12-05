package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить данные на экран.
3. Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
4. Выведенные числа должны быть упорядочены по убыванию.
5. Метод main должен использовать метод sort.
6. Метод sort должен использовать метод isGreaterThan.
7. Метод sort должен использовать метод isNumber
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);
//
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        for (String s : array){
            if(isNumber(s)) integerList.add(Integer.parseInt(s));
            else stringList.add(s);
        }

//        Collections.sort(stringList);

        for(int i = 0; i< stringList.size()-1; i++){
            for(int j = 0; j<stringList.size()-i-1; j++){
                if(isGreaterThan(stringList.get(j), stringList.get(j+1))){
                    String buff = stringList.get(j);
                    stringList.set(j,stringList.get(j+1));
                    stringList.set(j+1,buff);
                }
            }
        }

//        for (String x : stringList) {
//            System.out.println(x);
//        }


        Collections.sort(integerList);
        Collections.reverse(integerList);

        int stringListCounter = 0;
        int integerListCounter = 0;

        for (int i =0; i<array.length; i++){
            if(isNumber(array[i])){
                array[i] = integerList.get(integerListCounter++).toString();
            }
            else array[i] = stringList.get(stringListCounter++);
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
