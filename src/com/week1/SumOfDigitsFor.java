package com.week1;

import java.util.Scanner;

class SumOfDigitsFor 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number:");

        int n = sc.nextInt();
        
        int sum = 0;

        // for loop to extract digits
        for (; n > 0; n = n / 10) {
            sum = sum + (n % 10);
        }

        System.out.println("Sum of digits = " + sum);
    }
}

