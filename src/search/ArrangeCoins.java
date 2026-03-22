package search;

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    static int arrangeCoins(int n) {
        int start = 0;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long totalCoin = (long) mid * (mid + 1) / 2;
            if(totalCoin > n){
                end = mid - 1;
            }else if(totalCoin < n){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
