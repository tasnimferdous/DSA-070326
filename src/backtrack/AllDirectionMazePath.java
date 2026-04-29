package backtrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDirectionMazePath {
    public static void main(String[] args) {
        boolean[][] visited = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        System.out.println(mazePath("", visited, 0, 0));
    }

    private static List<String> mazePath(String p, boolean[][] visited, int row, int col) {
        if(row == visited.length - 1 && col == visited[0].length - 1){
            return new ArrayList<>(Collections.singleton(p));
        }
        if(visited[row][col]){
            return new ArrayList<>();
        }

        visited[row][col] = true;

        List<String> list = new ArrayList<>();
        if(row > 0){
            list.addAll(mazePath(p + 'U', visited, row-1, col));
        }
        if(row < visited.length - 1){
            list.addAll(mazePath(p + 'D', visited, row+1, col));
        }
        if(col > 0){
            list.addAll(mazePath(p + 'L', visited, row, col-1));
        }
        if(col < visited[0].length - 1){
            list.addAll(mazePath(p + 'R', visited, row, col+1));
        }

        visited[row][col] = false;
        return list;
    }
}
