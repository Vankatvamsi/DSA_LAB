package com.week12;
public class HashQuadratic {

    int size = 7;
    Integer[] table = new Integer[size];

    void insert(int key) {
        int index = key % size;
        int i = 1;

        while (table[index] != null) {
            index = (index + i * i) % size;
            i++;
        }

        table[index] = key;
        System.out.println(key + " inserted at index " + index);
    }

    void display() {
        for (int i = 0; i < size; i++)
            System.out.println(i + " -> " + table[i]);
    }
}