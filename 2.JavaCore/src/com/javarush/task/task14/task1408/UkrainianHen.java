package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen{
    private String country = "Ukraine";
    private int n = 13;

    @Override
    int getCountOfEggsPerMonth() {
        return n;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - " + country + ". Я несу " + n + " яиц в месяц.";
    }
}
