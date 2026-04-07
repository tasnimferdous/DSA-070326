package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    static int fibonacci(int n) {
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
