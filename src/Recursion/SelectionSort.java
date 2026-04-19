package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,0,-1};
        selectionSort(arr, arr.length-1, 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr, int row, int col, int maxIndex){
        if(row <= 0) return;
        if(col <= row){
            if(arr[col] > arr[maxIndex]){
                maxIndex = col;
            }
            selectionSort(arr, row, col+1, maxIndex);
        }else{
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[row];
            arr[row] = temp;
            selectionSort(arr, row-1, 1, 0);
        }
    }
}
