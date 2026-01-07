package com.week2;
public class LinearSearchRecursive 
{
    
    public static int linearSearch(int[] arr, int target, int index) 
    {	
        if (index == arr.length) 
        {
            return -1;
        }

        if (arr[index] == target) 
        {
            return index;
        }

        return linearSearch(arr, target, index + 1);
    }
    
    public static int linearSearch(int[] arr, int target) {
        return linearSearch(arr, target, 0);
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {64, 25, 12, 22, 11};
        int target = 22;
        
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}