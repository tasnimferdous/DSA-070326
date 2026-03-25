package search;

import java.util.Scanner;

//Without converting in 1D array approach
public class TwoDimSortedArray {
    public static void main(String[] args) {
        int[][] nums = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the target");
        int target = in.nextInt();
        System.out.println(searchMatrix(nums, target));
    }

    static boolean searchMatrix(int[][] nums, int target) {
        int cols = nums[0].length;
        int cLast = cols - 1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid][0] == target){
                return true;
            }
            if(nums[mid][0] < target){
                if(nums[mid][cLast] >= target){
                    //search in current row
                    return binarySearch(nums, target, mid, 1, cLast);
                }
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }

    static boolean binarySearch(int[][] nums, int target, int row, int start, int end) {
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(nums[row][mid] == target){
                return true;
            }
            if(nums[row][mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
