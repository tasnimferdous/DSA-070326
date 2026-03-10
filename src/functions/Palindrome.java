package functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
