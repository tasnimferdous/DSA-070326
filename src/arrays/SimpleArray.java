package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = in.nextInt();
        int[] intArr = new int[size];
        for(int i = 0; i < size; i++){
            intArr[i] = i*5;
        }

        System.out.println(Arrays.toString(intArr));
    }
}




