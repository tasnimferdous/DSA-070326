package sort;

import java.util.Arrays;

//take an element & put it at its right address till that part of the array
//8,1|,7,5,2,9,6,3,4
//1,8,7|,5,2,9,6,3,4
//1,7,8,5|,2,9,6,3,4
//1,5,7,8,2|,9,6,3,4
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,1,7,5,2,9,6,3,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break; // left side already sorted
                }
            }
        }
    }
}
