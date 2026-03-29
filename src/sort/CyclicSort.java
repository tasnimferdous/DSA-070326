package sort;

import java.util.Arrays;

// 1-n or 0-n
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {8,1,7,5,2,9,6,3,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int rightfulIndex = arr[i] - 1;
            if(i != rightfulIndex){
                int temp = arr[i];
                arr[i] = arr[rightfulIndex];
                arr[rightfulIndex] = temp;
            }else {
                i++;
            }
        }
    }
}
