package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        subSeq("", "abc");
        System.out.println();
        System.out.println(subSeqList("", "abc"));
    }

    private static void subSeq(String sub, String s) {
        if(s.isEmpty()){
            System.out.print(sub + " ");
            return;
        }
        char ch = s.charAt(0);
        subSeq(sub + ch, s.substring(1));
        subSeq(sub, s.substring(1));
    }

    private static List<String> subSeqList(String sub, String s) {
        if(s.isEmpty()){
            if(sub.isEmpty()){
                return new ArrayList<>();
            }else{
                return new ArrayList<>(Collections.singleton(sub));
            }
        }

        char ch = s.charAt(0);
        List<String> left = subSeqList(sub + ch, s.substring(1));
        List<String> right = subSeqList(sub, s.substring(1));
        left.addAll(right);
        return left;
    }
}
