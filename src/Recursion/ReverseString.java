package Recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        char[] arr = str.toCharArray();
        reverse(arr, 0, arr.length - 1);
        System.out.println(arr);
    }

    static void reverse(char[] arr, int start, int end){
        if(start >= end) return;
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
}
