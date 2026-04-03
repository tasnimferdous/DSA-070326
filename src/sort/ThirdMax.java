package sort;

import java.util.Arrays;

public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {-100,-98,-1,2,3,4};

        System.out.println(maximumProduct(arr));
    }
    static public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int prod1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        int prod2 = arr[0] * arr[1] * arr[arr.length - 1];
        return Math.max(prod1, prod2);
    }
}
