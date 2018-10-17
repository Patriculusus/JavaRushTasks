package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
//        System.out.println(isDateOdd("2018-12-08"));
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        long startTime = new Date(new Date(date).getYear(), 0, 1).getTime();
        long endTime = new Date(date).getTime();
        return (((endTime - startTime) / (1000 * 24 * 60 * 60)) - 1) % 2 != 0;
    }
}
