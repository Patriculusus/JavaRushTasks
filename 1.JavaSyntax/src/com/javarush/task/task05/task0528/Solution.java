package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(new Date()));
    }
}
