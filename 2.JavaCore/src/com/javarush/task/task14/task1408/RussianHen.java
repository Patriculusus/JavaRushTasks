package com.javarush.task.task14.task1408;

public class RussianHen extends Hen{
    private String country = "Russia";
    private int n = 28;

    @Override
    int getCountOfEggsPerMonth() {
        return n;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - " + country + ". Я несу " + n + " яиц в месяц.";
    }
}
