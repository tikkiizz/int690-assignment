package com.naphatj;

import java.io.*;
import java.util.Map;

public class Utilities {

    public static void printTime(String name, long time){
        System.out.println(name + " usage time: " + time + " ns");
    }
    public static void printMap(Map<Integer, Object> map){
        for(Map.Entry<Integer, Object> entry: map.entrySet()){
            System.out.println(entry);
        }
    }

    public static void initMap(Map<Integer, Object> map){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Sale.txt"));
            String line;
            while ((line = reader.readLine()) != null){
                line = line.replace("(", "").replace(");", "");
                if(line.isEmpty()){
                    continue;
                }
                String[] pair = line.split(",", 2);
                Integer key = Integer.valueOf(pair[0]);
                String[] sale = pair[1].split("',");
                String saleId = sale[0].trim();
                String saleName = sale[1].trim();
                saleId = saleId.substring(1, saleId.length());
                saleName = saleName.substring(1, saleName.length() - 1);
                map.put(key, new Sale(saleId, saleName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
