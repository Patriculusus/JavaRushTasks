package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private int weight;
        private float height;
        private char sex;
        // Напишите тут ваши переменные и конструкторы

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, int weight) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, String lastName, int age, int weight, float height) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, String lastName, int age, int weight, float height, char sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, String lastName, int weight, float height, char sex) {
            this.name = name;
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, int weight, char sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, float height) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.height = height;
        }

        public Human(String name, char sex) {
            this.name = name;
            this.sex = sex;
        }
    }
}
