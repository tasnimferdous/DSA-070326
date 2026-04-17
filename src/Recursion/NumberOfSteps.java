package Recursion;

import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }

    static int numberOfSteps(int num) {
        return steps(num, 0);
    }

    static int steps(int num, int count){
        if(num == 0) return count;
        count++;
        return num % 2 == 0 ? steps(num / 2, count) : steps(num - 1, count);
    }
}
