package com.week2;
public class SelectionSortRecursive {

    // Public method to start recursive selection sort
    public static void selectionSort(int[] arr) {
        selectionSortRecursive(arr, 0);
    }

    // Recursive helper: sorts arr[start..n-1]
    private static void selectionSortRecursive(int[] arr, int start) {
        int n = arr.length;

        // Base case: when start reaches last element, array is sorted
        if (start >= n - 1) {
            return;
        }

        // Find index of minimum element in arr[start..n-1]
        int minIndex = start;
        for (int i = start + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap current start element with found minimum
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recurse for the remaining subarray
        selectionSortRecursive(arr, start + 1);
    }

    // Utility function to print array
    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array:   ");
        printArray(arr);
    }
}
