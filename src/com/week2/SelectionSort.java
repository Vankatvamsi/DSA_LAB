package com.week2;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            // Find minimum element
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            // Intermediate output after each pass
            System.out.println("After Pass " + (i+1) + " : "
                               + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.println("Sorted Array: "
                           + Arrays.toString(arr));
    }
}
