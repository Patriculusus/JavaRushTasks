package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    String color;
    String address;
    int age;
    int weight;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 5;
        this.color = "blue";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = "green";
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 7;
    }

    public Cat(int weight, String color,  String address) {
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.age = 4;
    }

    public static void main(String[] args) {

    }
}
