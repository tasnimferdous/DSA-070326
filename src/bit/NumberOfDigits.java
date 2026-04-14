package bit;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int base = 10;
        System.out.println((int) (Math.log(n) / Math.log(base)) + 1);
    }
}
