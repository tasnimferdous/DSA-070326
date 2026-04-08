package Recursion;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr = {-5,-2,0,1,5,7,9,12,45,67,89,99};
        int target = 89;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearch(arr, target, start + 1, end);
        }
        return binarySearch(arr, target, start, end - 1);
    }
}
