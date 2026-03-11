package com.week8;
public class StackArray {
    int maxSize = 5;
    int[] stack = new int[maxSize];
    int top = -1;
    
    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + "inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}