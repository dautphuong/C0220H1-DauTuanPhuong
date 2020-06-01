package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestArrayListLinkedList {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("a");
        listStr.add("b");

        listStr.get(0);

        List<String> listLinkedStr = new LinkedList<>();
        listLinkedStr.add("a");
        listLinkedStr.add("b");

        listLinkedStr.get(0);

        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");

    }
}
