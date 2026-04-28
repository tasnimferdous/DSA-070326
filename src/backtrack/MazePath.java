package backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(mazePath("", 3, 3));
        System.out.println(mazePathCount(3, 3));
    }

    private static List<String> mazePath(String p, int row, int col) {
        if(row == 1 && col == 1){
            return new ArrayList<>(Collections.singleton(p));
        }

        List<String> list = new ArrayList<>();
        if(row > 1){
            list.addAll(mazePath(p + "D", row-1, col));
        }
        if(col > 1){
            list.addAll(mazePath(p + "R", row, col-1));
        }
        return list;
    }

    private static int mazePathCount(int row, int col) {
        if(row == 1 || col == 1) return 1;
        int left = mazePathCount(row-1, col);
        int right = mazePathCount(row, col-1);
        return left + right;
    }
}
