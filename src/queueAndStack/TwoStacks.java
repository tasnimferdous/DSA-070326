package queueAndStack;

import java.util.Arrays;

public class TwoStacks {
    public static void main(String[] args) {
        int[] arr1 = {4,2,4,6,1};
        int[] arr2 = {2,1,8,5};
        int maxSum = 10;
        System.out.println(maxItems(arr1, arr2, maxSum, 0, 0) - 1);
    }

    private static int maxItems(int[] arr1, int[] arr2, int maxSum, int sum, int count){
        if(sum > maxSum) return count;
        if(arr1.length == 0 || arr2.length == 0) return count;

        int leftCount = maxItems(Arrays.copyOfRange(arr1, 1, arr1.length), arr2, maxSum, sum+arr1[0], count+1);
        int rightCount = maxItems(arr1, Arrays.copyOfRange(arr2, 1, arr2.length), maxSum, sum+arr2[0], count+1);
        return Math.max(leftCount, rightCount);
    }
}
