package com.javarush.task.task05.task0527;

/* 

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse taffiMouse = new Mouse("Taffi", 10, 4);

        Cat tomCat = new Cat("Tom", 55, 20);
        Cat butchCat = new Cat("Butch", 65, 35);

        Dog spaikDog = new Dog("Spaik", 100, 15);
        Dog TaikDog = new Dog("Taik", 100, 15);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
