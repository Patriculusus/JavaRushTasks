package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Программа должна создавать FileInputStream для введенной с консоли строки
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        FileInputStream fis = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Scanner scanner = new Scanner(fis);
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()){
            int a = scanner.nextInt();
            if(a%2==0) numbers.add(a);
        }

        fis.close();
        Collections.sort(numbers);

        for(Integer i : numbers){
            System.out.println(i);
        }
    }
}
