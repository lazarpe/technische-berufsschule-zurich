package com.company;

import org.w3c.dom.Node;

/**
 * Created by lazar on 07.09.2021.
 * Project name: linkedlist
 **/
public class MyLinkedList {
    //reference to the head node
    public Node head;
    public int listCount; // a counter used for looping

    public MyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add (Object value) {
        Node newElement = new Node(value);
        Node current = head; //head is the current node

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newElement);
        listCount++;
    }

    public void addAtBegining(Object value) {
        Node newNode = new Node(value);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void printValueFromAllNodes() {
        Node current = head; //head is the current node
        while (current.getNext() != null) {
            current = current.getNext();
            System.out.println(current.getItem());
        }
    }

    public void printValueFromAllNodesInReversedOrder(Node head) {
        if (head == null) return;
        printValueFromAllNodesInReversedOrder(head.next);
        if (head.getItem() != null) {
            System.out.println(head.getItem());
        }
    }

    public Node removeNode(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }
        second_last.next = null;
        return head;
    }

    private class Node {
        private Object item;
        private Node next;

        public Node(Object value) {
            item = value;
            next = null;
        }

        public Node (Object value, Node nextValue) {
            next = nextValue;
            item = value;
        }

        public Object getItem() {
            return item;
        }

        public void setItem(Object item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

