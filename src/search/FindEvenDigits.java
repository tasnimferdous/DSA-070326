package search;

public class FindEvenDigits {
    public static void main(String[] args) {
        int[] arr = {555,9001,482, -1771, 3465, 7, 23645};
        System.out.println(findNumbers(arr));;
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if (evenDigit(num)) count++;
        }
        return count;
    }

    static boolean evenDigit(int num) {
        if (num == 0) return false;
        if (num < 0) num *= -1;
        return numOfDigits3(num) % 2 == 0;
    }

    static int numOfDigits(int num) {
        return (int)(Math.log10(num)) + 1;
    }

    static int numOfDigits2(int num) {
        return Integer.toString(num).length();
    }

    static int numOfDigits3(int num) {
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
