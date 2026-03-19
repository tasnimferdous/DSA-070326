package search;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        System.out.println(squareRoot(num));
    }

    static int squareRoot(int num) {
        if(num == 0){
            return 0;
        }
        int start = 1;
        int end = num;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid == num / mid){ // mid * mid == num but mid * mid exceeds int range
                return mid;
            } else if (mid > num / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
