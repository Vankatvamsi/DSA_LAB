package com.week10;
public class CircularQueue {

    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    // Enqueue Operation
    void enqueue(int value) {

        // Check Overflow
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow! Cannot insert " + value);
            return;
        }

        // First element insertion
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
        System.out.println(value + " inserted into queue");
    }

    // Dequeue Operation
    void dequeue() {

        // Check Underflow
        if (front == -1) {
            System.out.println("Queue Underflow! Queue is empty");
            return;
        }

        System.out.println(queue[front] + " removed from queue");

        // If only one element
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    // Display Operation
    void display() {

        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Queue elements are:");
        int i = front;

        while (true) {
            System.out.println(queue[i]);
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();

        q.enqueue(60);
        q.enqueue(70);

        q.display();
    }
}