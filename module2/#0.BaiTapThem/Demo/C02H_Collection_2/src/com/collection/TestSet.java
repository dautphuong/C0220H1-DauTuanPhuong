package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<String> setStr = new HashSet<>();
        setStr.add("Quoc Long");
        setStr.add("Tuan Phuong");
        setStr.add("Ngoc Quan");
        setStr.add("My Tinh");
        setStr.add("Quoc Khanh");

        Set<String> setStr2 = new TreeSet<>();
        setStr2.add("Quoc Long");
        setStr2.add("Tuan Phuong");
        setStr2.add("Ngoc Quan");
        setStr2.add("My Tinh");
        setStr2.add("Quoc Khanh");

        System.out.println(setStr);
        System.out.println(setStr2);

        Set<String> setStr3 = new TreeSet<>();
        setStr3.add("1");
        setStr3.add("2");
        setStr3.add("4");
        setStr3.add("12");
        setStr3.add("11");

        System.out.println(setStr3);
    }
}
