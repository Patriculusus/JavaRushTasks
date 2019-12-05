package com.javarush.task.task10.task1012;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import javax.swing.text.StringContent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9


Требования:
1. Программа должна 10 раз считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Выведенный текст должен содержать 33 строки.
4. Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        Map<Character, Integer> alphabetMap = new HashMap<>();

        StringBuilder resultString = new StringBuilder();
        for(String s : list){
            resultString.append(s);
        }

        ArrayList<Character> listL = new ArrayList();
        for(Character c : resultString.toString().toCharArray()){
            listL.add(c);
        }

        for(Character c : alphabet){
            int charCounter = Collections.frequency(listL, c);

            System.out.println(c + " " + charCounter);
        }

//        for (Map.Entry<Character, Integer> entry : alphabetMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }



        // напишите тут ваш код
    }
}
