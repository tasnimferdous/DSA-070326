package functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        System.out.println(evenOrOdd(num));

    }

    private static String evenOrOdd(int num) {
        if(num % 2 == 0){
            return "EVEN";
        }
        return "ODD";
    }
}
