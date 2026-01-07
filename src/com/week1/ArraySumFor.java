package com.week1;

import java.util.Scanner;

class ArraySumFor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Size of Array:");
        
        int n = sc.nextInt();
        
        System.out.println("Enter the Elements:");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array = " + sum);
        
         sc.close();
    }
}
