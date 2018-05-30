package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("KRISS", 19, "NY");
        Man man2 = new Man("SASHA", 49, "KIEV");
        Woman woman1 = new Woman("LENA", 18, "KIEV");
        Woman woman2 = new Woman("NINA", 24, "LONDON");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "VAGABOND";
        }

        public Man(int age, String address){
            this.name = "PALL";
            this.age = age;
            this.address = address;
        }

        public Man(String name, String address){
            this.name = name;
            this.age = 31;
            this.address = address;
        }

        public Man(String name){
            this.name = name;
            this.age = 25;
            this.address = "VAGABOND";
        }

        public Man(int age){
            this.name = "MARK";
            this.age = age;
            this.address = "VAGABOND";
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age){
            this.name = name;
            this.age = age;
            this.address = "VAGABOND";
        }

        public Woman(int age, String address){
            this.name = "LARA";
            this.age = age;
            this.address = address;
        }

        public Woman(String name, String address){
            this.name = name;
            this.age = 31;
            this.address = address;
        }

        public Woman(String name){
            this.name = name;
            this.age = 25;
            this.address = "VAGABOND";
        }

        public Woman(int age){
            this.name = "OLGA";
            this.age = age;
            this.address = "VAGABOND";
        }
    }
}
