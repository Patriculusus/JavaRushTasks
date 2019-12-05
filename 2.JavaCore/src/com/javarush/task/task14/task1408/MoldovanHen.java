package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen{
    private String country = "Moldova";
    private int n = 17;

    @Override
    int getCountOfEggsPerMonth() {
        return n;
    }

    @Override
    String getDescription() {
        return super.getDescription()+" Моя страна - " + country + ". Я несу " + n + " яиц в месяц.";
    }
}
