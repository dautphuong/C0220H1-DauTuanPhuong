package com.collection;

import java.util.*;

public class TestStackQueue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("quan");
        stack.push("ao");
        stack.push("mu");

        System.out.println(stack.pop());

        Queue<String> queue = new LinkedList<>();
        queue.add("nguoi thu 1");
        queue.add("nguoi thu 2");
        queue.add("nguoi thu 3");

        System.out.println(queue.peek());

        Deque<String> deque = new LinkedList<>();
    }
}
