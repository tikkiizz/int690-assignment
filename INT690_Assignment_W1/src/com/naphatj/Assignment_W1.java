package com.naphatj;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static com.naphatj.Utilities.*;

public class Assignment_W1 {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, Object> saleHM = new HashMap<>();
        LinkedHashMap<Integer, Object> saleLHM = new LinkedHashMap<>();
        TreeMap<Integer, Object> saleTM = new TreeMap<>();
        long start;
        long end;

        start = System.nanoTime();
        initMap(saleHM);
        end = System.nanoTime();
        printTime("Init hash map", end - start);

        start = System.nanoTime();
        initMap(saleLHM);
        end = System.nanoTime();
        printTime("Init linked hash map", end - start);

        start = System.nanoTime();
        initMap(saleTM);
        end = System.nanoTime();
        printTime("Init tree map", end - start);

        start = System.nanoTime();
        saleHM.get(100000);
        end = System.nanoTime();
        printTime("Search no key in hash map", end - start);

        start = System.nanoTime();
        saleLHM.get(100000);
        end = System.nanoTime();
        printTime("Search no key in linked hash map", end - start);

        start = System.nanoTime();
        saleTM.get(100000);
        end = System.nanoTime();
        printTime("Search no key in tree map", end - start);

        start = System.nanoTime();
        System.out.println(saleHM.get(30000));
        end = System.nanoTime();
        printTime("Search mid key in hash map", end - start);

        start = System.nanoTime();
        System.out.println(saleLHM.get(30000));
        end = System.nanoTime();
        printTime("Search mid key in linked hash map", end - start);

        start = System.nanoTime();
        System.out.println(saleTM.get(30000));
        end = System.nanoTime();
        printTime("Search mid key in tree map", end - start);

        /*
        System.out.println("Hash map");
        printMap(saleHM);
        System.out.println("Linked hash map");
        printMap(saleLHM);
        System.out.println("Tree map");
        printMap(saleTM);

        */
    }


}
