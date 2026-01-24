package com.sail.linkedListProblems;

public class ReverseLL {
    public static void main(String[] args) {

        // node initialization...
        Node node1 = new Node(5);
        Node node2 = new Node(64);
        Node node3 = new Node(8);
        Node node4 = new Node(25);
        node1.next = node2;
        node1.next.next = node3;
        node1.next.next.next = node4;

        // defining new temp,revNode Node....
        // head set as null.
        Node temp = new Node();
        temp.next = node1;
        Node revNode = new Node();
        Node head = null;
        while (temp != null) {
            System.out.println(temp.data);
            revNode = temp.next;
            temp.next = head;
            head = temp;
            temp = revNode;
        }

        System.out.println("reversed......");

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}

class Node {
    Integer data;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }
}
