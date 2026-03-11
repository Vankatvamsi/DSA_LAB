package com.week8;
public class StackLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    // Push Operation
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed into stack");
    }

    // Pop Operation
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow! Stack is empty");
        } else {
            System.out.println(top.data + " popped from stack");
            top = top.next;
        }
    }

    // Peek Operation
    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.data);
        }
    }

    // Display Operation
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(100);
        s.push(200);
        s.push(300);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}