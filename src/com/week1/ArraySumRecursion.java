package com.week1;

import java.util.Scanner;

class ArraySumRecursion {

    static int sumArray(int[] arr, int n) {
        if (n == 0)
            return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array:");
        
        int n = sc.nextInt();
   
        System.out.println("Enter the Elements:");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array = " + sumArray(arr, n));
        sc.close();
    }
}

