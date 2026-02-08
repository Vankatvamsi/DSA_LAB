package com.week2;
public class BinarySearchRecursive 
{
    public static int binarySearch(int[] arr, int target, int left, int right) 
    {
        if (left > right) 
        {
            return -1;
        }
        int mid = left + right / 2;
        if (arr[mid] == target) 
        {
            return mid;
        }
        else if (arr[mid] < target) 
        {
            return binarySearch(arr, target, mid + 1, right);
        }
        else 
        {
            return binarySearch(arr, target, left, mid - 1);
        }
    }
    public static int binarySearch(int[] arr, int target) 
    {
        return binarySearch(arr, target, 0, arr.length - 1);
    }
    public static void main(String[] args) 
    {
        int[] arr = {11, 12, 22, 25, 64};  
        int target = 22;
        int result = binarySearch(arr, target);
        if (result != -1) 
        {
            System.out.println("Element found at index: " + result);
        } 
        else 
        {
            System.out.println("Element not found");
        }
    }
}
