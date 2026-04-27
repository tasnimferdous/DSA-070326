package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        List<List<Integer>> ans2 = subsetRec(new ArrayList<>() {}, arr);
        System.out.println(ans);
        System.out.println(ans2);
    }

    private static List<List<Integer>> subsetRec(List<Integer> sub, int[] arr) {
        if(arr.length == 0){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>(sub));
            return ans;
        }
        List<List<Integer>> left = new ArrayList<>(subsetRec(sub, Arrays.copyOfRange(arr, 1, arr.length)));
        sub.add(arr[0]);
        List<List<Integer>> right = new ArrayList<>(subsetRec(sub, Arrays.copyOfRange(arr, 1, arr.length)));
        sub.removeLast();
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
