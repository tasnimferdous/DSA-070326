package Recursion;

public class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }

    static boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n < 1) return false;
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
