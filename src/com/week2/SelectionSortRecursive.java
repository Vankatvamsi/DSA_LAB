package com.week2;
public class SelectionSortRecursive {

    public static void selectionSort(int[] arr) {
        selectionSortRecursive(arr, 0);
    }
    private static void selectionSortRecursive(int[] arr, int start) {
        int n = arr.length;
        if (start >= n - 1) {
            return;
        }
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;
        selectionSortRecursive(arr, start + 1);
    }
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array:   ");
        printArray(arr);
    }
}
