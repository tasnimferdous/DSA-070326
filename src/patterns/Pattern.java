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
        pattern6(n);
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
