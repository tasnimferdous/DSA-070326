package search;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,13,15,17,21,25,28,35,40,44};
        int target = 2;
        System.out.println(findTheTarget(arr, target));
    }

    private static int findTheTarget(int[] arr, int target) {
        // We don't know the array size
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            // newEnd = previous end + size of previous arr * 2
                    // Example
                    // = 1 + (1 - 0 + 1) * 2  // array size = end - start + 1
                    // = 5
            end = end + (end - start + 1) * 2; // end = newStart * 2 + 1; another formula
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
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
