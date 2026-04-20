package sort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,0,-1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end){
        if(end - start <= 1) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, end, mid);
    }

    private static void merge(int[] arr, int start, int end, int mid) {
        int i = start;
        int j = mid;
        int k = 0;
        int[] newArr = new int[end - start];
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                newArr[k] = arr[i];
                i++;
            }else{
                newArr[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < mid){
            newArr[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            newArr[k] = arr[j];
            j++;
            k++;
        }

        for(i = 0; i < newArr.length; i++){
            arr[start+i] = newArr[i];
        }
    }
}
