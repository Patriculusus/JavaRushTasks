package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        String result = "";

        while (!result.equals("сумма")){
            result = reader.readLine();
            int buff = 0;
            try{
                buff = Integer.parseInt(result);
                sum += buff;
            }catch (Exception e){
            }
        }
        System.out.println(sum);

    }
}
