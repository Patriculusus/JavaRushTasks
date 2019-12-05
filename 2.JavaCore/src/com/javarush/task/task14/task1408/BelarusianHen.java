package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen{
    private String country = "Belarus";
    private int n = 22;

    @Override
    int getCountOfEggsPerMonth() {
        return n;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - " + country + ". Я несу " + n + " яиц в месяц.";
    }
}
