package loop;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        System.out.println(subtractProductAndSum(num));
    }

    static int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            prod *= rem;
            sum += rem;
        }
        return prod-sum;
    }
}
