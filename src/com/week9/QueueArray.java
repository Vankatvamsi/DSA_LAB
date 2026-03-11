package com.week9;

public class QueueArray {

    int size = 5;
    int[] queue = new int[size];
    int front = -1, rear = -1;

    // Enqueue Operation
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow! Cannot insert " + value);
        } else {
            if (front == -1)
                front = 0;
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    // Dequeue Operation
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow! Queue is empty");
        } else {
            System.out.println(queue[front] + " removed from queue");
            front++;
        }
    }

    // Display Operation
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.println(queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}