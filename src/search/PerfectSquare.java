package search;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(69));
    }

    static boolean isPerfectSquare(int num) {
        if (num == 0) return false;
        int start = 1;
        int end = num;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long mul= (long) mid * mid;
            if(mul  > num){
                end = mid - 1;
            } else if(mul  < num){
                start = mid + 1;
            } else{
                return true;
            }
        }

        return false;
    }
}