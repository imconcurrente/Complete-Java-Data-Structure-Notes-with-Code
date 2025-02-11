package com.java;

public class DLL {

   private Node head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head !=  null) {  // null pointer
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;   // last = tail, here we're not taking tail as a variable
        while (node != null){
            System.out.print(node.value + "-> ");
            last = node;
            node = node.next;
        }
        System.out.println("END ");

        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public DLL.Node find(int value){
        DLL.Node node = head;
        while (node != null) {
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void insert(int after, int value){
        Node p = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev =  p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
    }
    }