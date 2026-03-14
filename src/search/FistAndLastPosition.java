package search;

import java.util.Arrays;

public class FistAndLastPosition {
    public static void main (String[] args){
        int[] arr = {5,7,7,7,7,7,8,8,8,19,26,26};
        int target = 13;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = SearchIndexNumber(nums, target, true);
        if(ans[0] != -1){
            ans[1] = SearchIndexNumber(nums, target, false);
        }
        return ans;
    }

    static int SearchIndexNumber(int[] nums, int target, boolean findFirst) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                index = mid; // possible ans
                if (findFirst) { // If looking for first occurrence then search on the left side
                    end = mid - 1;
                } else { // If looking for last occurrence then search on the left side
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}
