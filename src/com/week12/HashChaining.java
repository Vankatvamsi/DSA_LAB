package com.week12;
import java.util.LinkedList;

public class HashChaining {

    int size = 7;
    LinkedList<Integer>[] table = new LinkedList[size];

    HashChaining() {
        for (int i = 0; i < size; i++)
            table[i] = new LinkedList<>();
    }

    void insert(int key) {
        int index = key % size;
        table[index].add(key);
        System.out.println(key + " inserted at index " + index);
    }

    boolean search(int key) {
        int index = key % size;
        return table[index].contains(key);
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " -> ");
            for (int val : table[i])
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashChaining h = new HashChaining();
        h.insert(10);
        h.insert(17);
        h.insert(24);  // collision example
        h.display();
    }
}