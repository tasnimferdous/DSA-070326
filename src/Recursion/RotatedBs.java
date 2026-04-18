package Recursion;

public class RotatedBs {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 9;
        System.out.println(searchIndex(arr, target, 0, arr.length-1));
    }

    private static int searchIndex(int[] arr, int target, int start, int end) {
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[start] <= arr[mid]){
            if (target >= arr[start] && target <= arr[mid]){
                return searchIndex(arr, target, start, mid-1);
            }else {
                return searchIndex(arr, target, mid+1, end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return searchIndex(arr, target, mid+1, end);
        }
        return searchIndex(arr, target, start, mid-1);
    }
}
