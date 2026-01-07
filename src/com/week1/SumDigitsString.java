package com.week1;

import java.util.Scanner;

class SumDigitsString 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int sum = 0;

        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        System.out.println("Sum of digits = " + sum);
        
        sc.close();
    }
}
