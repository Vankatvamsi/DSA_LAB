package com.week2;
public class LinearSearch 
{

    public static int linearSearch(int[] arr, int target) 
    {	
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) 
            {
                return i; 
            }
        }
        return -1; 
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
        
        System.out.print("Array: ");
        printArray(arr);
        
        int target = 22;
        int result = linearSearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }
}
