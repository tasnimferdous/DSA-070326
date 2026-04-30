package backtrack;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }

    static List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return placement(board, 0);
    }

    private static List<List<String>> placement(boolean[][] board, int row) {
        if(row == board.length){
            return shape(board);
        }

        List<List<String>> list = new ArrayList<>();
        for(int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)){
                board[row][col] = true;
                list.addAll(placement(board, row+1));
                board[row][col] = false;
            }
        }
        return list;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0; i < row; i++){
            if(board[i][col]) return false;
        }

        int maxLeft = Math.min(row, col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]) return false;
        }

        int maxRight = Math.min(row, board.length- col - 1);
        for(int i = 1; i <= maxRight; i++){
            if(board[row-i][col+i]) return false;
        }
        return true;
    }

    private static List<List<String>> shape(boolean[][] board) {
        List<List<String>> list = new ArrayList<>();
        List<String> queen = new ArrayList<>();
        for(boolean[] row : board){
            StringBuilder stringBuilder = new StringBuilder();
            for(boolean item : row){
                if(item){
                    stringBuilder.append('Q');
                }else {
                    stringBuilder.append('.');
                }
            }
            queen.add(stringBuilder.toString());
        }
        list.add(queen);
        return list;
    }
}
