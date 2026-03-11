package com.week9;
public class QueueLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null, rear = null;

    // Enqueue Operation
    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value + " inserted into queue");
    }

    // Dequeue Operation
    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow! Queue is empty");
        } else {
            System.out.println(front.data + " removed from queue");
            front = front.next;

            if (front == null)
                rear = null;
        }
    }

    // Display Operation
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            Node temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.display();
        q.dequeue();
        q.display();
    }
}