package com.week11;
public class HashLinearProbing {

    int size = 10;
    Integer[] table = new Integer[size];

    // Insert
    void insert(int key) {
        int index = key % size;

        while (table[index] != null) {
            index = (index + 1) % size;
        }

        table[index] = key;
        System.out.println(key + " inserted at index " + index);
    }

    // Search
    boolean search(int key) {
        int index = key % size;
        int startIndex = index;

        while (table[index] != null) {
            if (table[index] == key)
                return true;

            index = (index + 1) % size;

            if (index == startIndex)
                break;
        }
        return false;
    }

    // Display
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }

    public static void main(String[] args) {
        HashLinearProbing h = new HashLinearProbing();
        h.insert(10);
        h.insert(20);
        h.insert(30);
        h.insert(25); // collision example
        h.display();

        System.out.println("Search 25: " + h.search(25));
    }
}