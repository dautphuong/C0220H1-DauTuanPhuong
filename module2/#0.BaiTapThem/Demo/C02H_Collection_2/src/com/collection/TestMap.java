package com.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("CGDN00234", null);
        hashMap.put(null, "Quan");
        hashMap.put("CGDN00124", "Khanh");

        System.out.println("hashMap " + hashMap);

        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("CGDN00234", null);
        hashTable.put(null, "Quan");
        hashTable.put("CGDN00124", "Khanh");

        System.out.println("hashTable " + hashTable);
    }

}
