package search;

import java.util.Scanner;

public class FloorNumber {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int target = in.nextInt();
        int[] arr = {1,3,6,9,11,14,15,19,30};
        System.out.println(findCeiling(arr, target));
    }

    static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
