package com.week2;
public class SelectionSort 
{

    public static void selectionSort(int[] arr) 
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void printArray(int[] arr) 
    {
        for (int val : arr)
        {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array:   ")	;
        printArray(arr);
    }
}