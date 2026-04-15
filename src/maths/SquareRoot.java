package maths;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 120;
        int precision = 3;
        System.out.printf("%.3f", squareRoot(n, precision));
    }

    private static double squareRoot(int n, int precision) {
        int start = 0;
        int end = n;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == n){
                return mid;
            }else if (mid * mid < n){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        double root = end;
        double increment = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= n){
                root += increment;
            }
            root -= increment;
            increment /= 10;
        }
        return root;
    }
}
