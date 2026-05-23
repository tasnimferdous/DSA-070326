import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameWon = false;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (!gameWon) {
            count++;
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = input.nextInt();
            int col = input.nextInt();

            if (board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Cell already occupied. Try again.");
            }

            if (count == 9 && !gameWon) {
                printBoard(board);
                System.out.println("It's a draw!");
                return;
            }
        }

        printBoard(board);
        System.out.println("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins!");
    }

    private static boolean checkWin(char[][] board, char currentPlayer) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        if((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " | ");
            }
            System.out.println();
        }
    }
}
