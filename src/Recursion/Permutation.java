package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> ans = permute("", "abc");
        System.out.println(ans);
    }

    private static List<String> permute(String p, String up) {
        if(up.isEmpty()){
            return new ArrayList<>(Collections.singleton(p));
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            ans.addAll(permute(first + ch + second, up.substring(1)));
        }
        return ans;
    }
}
