package com.week2;
import java.util.Arrays;

public class BubbleSortRecursive 
{
    public static void bubbleSort(int[] arr) 
    {
        bubbleSortRecursive(arr, arr.length);
    }
    private static void bubbleSortRecursive(int[] arr, int n)
    {
        if (n == 0) 
        {
            return;
        }
        for (int i = 0; i < n - 1; i++) 
        {
            if (arr[i] > arr[i + 1]) 
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSortRecursive(arr, n - 1);
    }

    public static void printArray(int[] arr) 
    {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) 
    {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original array: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Sorted array:   ");
        printArray(arr);
    }
}
