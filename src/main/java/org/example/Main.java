package org.example;
public class Main {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5; // Change the value of n as needed
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
