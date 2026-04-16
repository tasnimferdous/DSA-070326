package maths;

public class GcdAndLcm {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b % a, a);
    }
}
