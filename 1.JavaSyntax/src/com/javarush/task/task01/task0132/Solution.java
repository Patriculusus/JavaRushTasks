package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int first = number/100;
        int resrt = number%100;
        int second = resrt/10;
        int last = resrt%10;
        return (first+second+last);
    }
}