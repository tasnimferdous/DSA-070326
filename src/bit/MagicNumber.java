package bit;

import java.util.Scanner;

// 5 based magic number

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.printf("%d magic number is %d", n, findMagicNumber(n));
    }

    private static int findMagicNumber(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
