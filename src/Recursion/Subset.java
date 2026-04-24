package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
//        List<List<Integer>> ans2 = subsetRec(new ArrayList<>() {}, arr);
        System.out.println(ans);
//        System.out.println(ans2);
    }

    private static List<List<Integer>> subsetRec(List<Integer> sub, int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        if(arr.length == 0){
            outer.add(sub);
            return outer;
        }
        int first = arr[0];
        List<List<Integer>> left = subsetRec(sub, Arrays.copyOfRange(arr, 1, arr.length));
        sub.add(first);
        List<List<Integer>> right = subsetRec(sub, Arrays.copyOfRange(arr, 1, arr.length));
        left.addAll(right);
        return left;
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

}
