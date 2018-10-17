package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        ArrayList<Adresat> list = new ArrayList<Adresat>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String name = reader.readLine();
            list.add(new Adresat(city, name));
        }

        // Read the house number
        String cityName = reader.readLine();

        for(Adresat adr : list){
            if(adr.city.equals(cityName))
            System.out.println(adr.sureName);
        }
    }

    public static class Adresat{
        String city;
        String sureName;

        Adresat(String city, String name){
            this.city = city;
            this.sureName = name;
        }
    }
}
