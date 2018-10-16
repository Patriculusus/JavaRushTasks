package com.javarush.task.task08.task0824;

/* 
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        child1.name = "Chan";
        child1.sex = true;
        child1.age = 10;
        child1.children = new ArrayList<>();
        System.out.println(child1.toString());

        Human child2 = new Human();
        child2.name = "Timy";
        child2.sex = true;
        child2.age = 13;
        child2.children = new ArrayList<>();
        System.out.println(child2.toString());

        Human child3 = new Human();
        child3.name = "Caty";
        child3.sex = false;
        child3.age = 18;
        child3.children = new ArrayList<>();
        System.out.println(child3.toString());

        Human father = new Human();
        father.name = "Boby";
        father.sex = true;
        father.age = 40;
        father.children = new ArrayList<>();
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        System.out.println(father.toString());

        Human mother = new Human();
        mother.name = "Nina";
        mother.sex = false;
        mother.age = 35;
        mother.children = new ArrayList<>();
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);
        System.out.println(mother.toString());

        Human grandFather1 = new Human();
        grandFather1.name = "LaryKing";
        grandFather1.sex = true;
        grandFather1.age = 80;
        grandFather1.children = new ArrayList<>();
        grandFather1.children.add(father);
        System.out.println(grandFather1.toString());

        Human grandFather2 = new Human();
        grandFather2.name = "Lary";
        grandFather2.sex = true;
        grandFather2.age = 80;
        grandFather2.children = new ArrayList<>();
        grandFather2.children.add(mother);
        System.out.println(grandFather2.toString());

        Human grandMother1 = new Human();
        grandMother1.name = "Lucy";
        grandMother1.sex = false;
        grandMother1.age = 70;
        grandMother1.children = new ArrayList<>();
        grandMother1.children.add(father);
        System.out.println(grandMother1.toString());

        Human grandMother2 = new Human();
        grandMother2.name = "LucyMusy";
        grandMother2.sex = false;
        grandMother2.age = 70;
        grandMother2.children = new ArrayList<>();
        grandMother2.children.add(mother);
        System.out.println(grandMother2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
