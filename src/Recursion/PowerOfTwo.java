package Recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n < 1) return false;
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }
}
