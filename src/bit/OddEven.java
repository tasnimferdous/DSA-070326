package bit;

import java.util.Scanner;

// odd, if any number n & 1 == 1
// 1010
//&
// 0001
// 0000 , hence even
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
