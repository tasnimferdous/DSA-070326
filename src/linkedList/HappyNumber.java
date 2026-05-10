package linkedList;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isHappy(n));
    }

    private static boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }while(fast != slow);

        return fast == 1;
    }

    private static int squareSum(int n) {
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }
}
