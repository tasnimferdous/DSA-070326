package bit;

import java.util.Scanner;

public class NoOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
