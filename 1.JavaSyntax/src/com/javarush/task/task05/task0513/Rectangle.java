package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int left, top, width, height;

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 5;
        this.height = 5;
    }

    public void initialize(Rectangle toCopy){
        this.left = toCopy.left;
        this.top = toCopy.top;
        this.width = toCopy.width;
        this.height = toCopy.height;
    }


    public static void main(String[] args) {

    }
}
