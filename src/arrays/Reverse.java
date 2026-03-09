package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = i * 4;
        }

        System.out.println(Arrays.toString(array));

        reverse(array);

        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int start = array[0];
        int end = array.length - 1;
        while (start < end){
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
