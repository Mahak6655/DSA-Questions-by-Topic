import java.util.*;

public class NQueens {

    // Checks whether a queen can be safely placed
    // at the given row and column
    public static boolean isSafe(char[][] board, int row, int col) {

        // Check vertically upward in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // No queen attacks this position
        return true;
    }

    // Backtracking function to place queens row by row
    public static void solveNQueens(char[][] board, int row) {

        // Base case:
        // All queens have been successfully placed
        if (row == board.length) {
            printBoard(board);
            System.out.println();
            return;
        }

        // Try placing a queen in every column of the current row
        for (int col = 0; col < board.length; col++) {

            // Place the queen only if the position is safe
            if (isSafe(board, row, col)) {

                // Choose: place the queen
                board[row][col] = 'Q';

                // Explore the next row
                solveNQueens(board, row + 1);

                // Backtrack:
                // Remove the queen and try another position
                board[row][col] = '.';
            }
        }
    }

    // Prints the current chessboard
    public static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Size of the chessboard
        int n = 4;

        // Create an n x n chessboard
        char[][] board = new char[n][n];

        // Initialize every cell with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start placing queens from row 0
        solveNQueens(board, 0);
    }
}