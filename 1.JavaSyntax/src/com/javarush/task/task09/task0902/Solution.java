package com.javarush.task.task09.task0902;

/* 
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[1].getMethodName();
//        System.out.println(name);
    }

    public static String method1() {
        method2();
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[2].getMethodName();
//        System.out.println(name);
//        return name;
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[2].getMethodName();
//        System.out.println(name);
//        return name;
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[2].getMethodName();
//        System.out.println(name);
//        return name;
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[2].getMethodName();
//        System.out.println(name);
//        return name;
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        String name = elements[2].getMethodName();
//        System.out.println(name);

//        System.out.println("---------------");
//        for(StackTraceElement element : elements){
//            System.out.println(element.getMethodName());
//        }
//        System.out.println("---------------");
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
