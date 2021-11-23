package com.company;

public class Main {

    public static void main(String[] args) {
	MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("Hallo");
        linkedList.add("Peter");

        linkedList.printValueFromAllNodes();
        linkedList.addAtBegining("DavidEE");
        linkedList.printValueFromAllNodes();
        //System.out.println("\nReversed:");
        //linkedList.printValueFromAllNodesInReversedOrder(linkedList.head);
        //linkedList.removeNode(linkedList.head);
        //System.out.println("Removed last node:");
        //linkedList.printValueFromAllNodes();
    }
}
