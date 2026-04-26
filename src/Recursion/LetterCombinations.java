package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations("423"));
    }

    static List<String> letterCombinations(String digits) {
        String[] numPad = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        return combination("", digits, numPad);
    }

    static List<String> combination(String p, String up, String[] numPad) {
        if (up.isEmpty()){
            return new ArrayList<>(Collections.singletonList(p));
        }

        int digit = up.charAt(0) - '0';
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < numPad[digit].length(); i++) {
            char ch = numPad[digit].charAt(i);
            ans.addAll(combination(p + ch, up.substring(1), numPad));
        }
        return ans;
    }
}
