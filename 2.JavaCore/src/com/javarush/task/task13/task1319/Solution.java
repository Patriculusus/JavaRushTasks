package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true){
            try {
                String s = reader.readLine();
                list.add(s);
                if(s.equals("exit")) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//        File file = new File("D:\\" + list.get(0));
//        if(!file.exists()){
//            file.createNewFile();
//        }
        FileWriter fileWriter = new FileWriter("D:\\" + list.get(0));
        BufferedWriter writer = new BufferedWriter(fileWriter);

//        for(String s : list){
//            writer.write(s+"\n");
//        }
        for(int i = 1; i<list.size(); i++){
            if(i!=list.size()-1){
                writer.write(list.get(i)+"\n");
            }else writer.write(list.get(i));
        }

        writer.flush();
        fileWriter.close();
        writer.close();
    }
}
