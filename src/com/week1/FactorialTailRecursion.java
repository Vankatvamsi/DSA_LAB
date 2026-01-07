package com.week1;

import java.util.Scanner;

class FactorialTailRecursion 
{

    static int factorial(int n, int res) 
    {
        if (n == 0)
            return res;
        return factorial(n - 1, n * res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n, 1));
        
        sc.close();
    }
}

