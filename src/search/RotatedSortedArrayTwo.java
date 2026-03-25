package search;

public class RotatedSortedArrayTwo {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,5,1};
        int target = 5;
        System.out.println(search(arr, target));
    }

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = findPivot(nums);

        if(pivot == -1){
            return searchInRange(nums, target, start, end);
        }
        if(target == nums[pivot] ||target == nums[start] || target == nums[end]){
            return true;
        }
        if(target > nums[start]){
            return searchInRange(nums, target, start+1, pivot-1);
        }
        return searchInRange(nums, target, pivot+1, end-1);
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        if(arr.length == 1){
            return start;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start<mid && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(end>mid && arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }

    static boolean searchInRange(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
