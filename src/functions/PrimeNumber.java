package functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        System.out.println(isPrime1(num));
        System.out.println(isPrime2(num));
    }

    static String isPrime1(int num) {
        if(num<=1) return "Not Prime";

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return "Not Prime";
        }
        return "Prime";
    }

    static String isPrime2(int num) {
        if(num<=1) return "Not Prime";
        if (num == 2 || num == 3) return "Prime";
        if(num % 2 == 0 || num % 3 == 0) return "Not Prime";

        for(int i = 5; i <= Math.sqrt(num); i = i+6){
            if(num % i == 0 || num % (i+2) == 0) return "Not Prime";
        }
        return "Prime";
    }
}
