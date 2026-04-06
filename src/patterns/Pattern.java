package patterns;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
//        pattern2(n);
//        pattern3(n);
//        pattern5(n);
//        pattern6(n);
//        pattern28(n);
//        pattern30(n);
//        pattern17(n);
        pattern31(n);
    }

    private static void pattern31(int n) {
        System.out.println("Pattern 31");
        for(int i = 1; i <= 2 * n - 1; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                int minDistance = n + 1 - Math.min(Math.min(i, j), Math.min(2 * n - i, 2 * n - j));
                System.out.print(minDistance + " ");
            }
            System.out.println();
        }
    }

    private static void pattern17(int n) {
        System.out.println("Pattern 30");
        for(int i = 1; i <= 2 * n - 1; i++){
            int col = i > n ? 2 * n - i : i;
            int spaces = n - col;
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int j = col; j >= 1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j <= col; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern30(int n) {
        System.out.println("Pattern 30");
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern28(int n) {
            System.out.println("Pattern 28");
            for(int i = 1; i <= 2 * n; i++){
                int col = i > n ? 2*n - i : i;
                int spaces = n - col;
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= col; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
    }

    private static void pattern6(int n) {
        System.out.println("Pattern 6");
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print(j <= n-i ? " " : "*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern5(int n) {
        System.out.println("Pattern 5");
        for(int i = 1; i <= 2 * n; i++){
            int col = i > n ? 2*n - i : i;
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern3(int n) {
        System.out.println("Pattern 3");
        for(int i = 1; i <= n; i++){
            for (int j = n-i+1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void pattern2(int n) {
        System.out.println("Pattern 2");
        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
