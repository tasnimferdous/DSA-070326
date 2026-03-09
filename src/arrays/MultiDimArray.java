package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = in.nextInt();
        int[][] arr = new int[size][size];

        for(int row = 0; row < size; row++){
            for(int col = 0; col < size; col++){
                arr[row][col] = row * col + 5;
            }
        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
