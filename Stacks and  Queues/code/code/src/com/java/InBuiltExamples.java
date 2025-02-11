package com.java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedTransferQueue;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//      System.out.println(stack.pop());

        System.out.println(); // done this for separation line for stack and queue

        Queue<Integer> queue = new LinkedTransferQueue<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(56);
        deque.addFirst(2);
        deque.removeLast();
        // etc...

    }
}