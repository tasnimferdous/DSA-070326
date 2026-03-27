package search;

public class MInimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,1,4};
        System.out.println(findMinimum(arr));
    }

    private static int findMinimum(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]){
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]){
                end = mid;
            }else{
                end --;
            }
        }
        return arr[end];
    }
}
