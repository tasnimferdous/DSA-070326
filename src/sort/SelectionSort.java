package sort;

import java.util.Arrays;
//Find maximum and move it at the end
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,1,7,5,2,9,6,3,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int start = 0;
            int end = arr.length- i - 1;
            int max = findMaximum(arr, start, end);
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
        }
    }

    static int findMaximum(int[] arr, int start, int end) {
        int max = start;
        for(int i = start ; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
