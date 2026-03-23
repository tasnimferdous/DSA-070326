package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-5,-2,0,1,5,7,9,12,45,67,89,99};
        int target = 76;
        System.out.println(binarySearch(arr, target));
    }
// If we're searching for a specific element
// loop through is start <= end
// otherwise start < end
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
