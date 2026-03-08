package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++){
            array[i] = i * 4;
        }

        System.out.println(Arrays.toString(array));

        swap(array, 2, 4);

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
