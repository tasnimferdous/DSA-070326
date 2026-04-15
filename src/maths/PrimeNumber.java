package maths;

import java.util.Scanner;

//Sieve's algorithm
//only applicable for a range

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range: ");
        int n = sc.nextInt();
        boolean[] visited = new boolean[n+1];
        findPrimeNumbers(n, visited);
    }

    private static void findPrimeNumbers(int n, boolean[] visited) {
        for (int i = 2; i * i <= n; i++) {
            if(!visited[i]){
                for (int j = 2 * i; j <= n; j += i) {
                    visited[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!visited[i]){
                System.out.print(i + " ");
            }
        }
    }
}
