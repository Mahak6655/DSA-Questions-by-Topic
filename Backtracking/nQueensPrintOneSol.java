public class nQueensPrintOneSol {

    // Check whether a queen can be safely placed
    // at the given row and column
    public static boolean isSafe(char[][] board, int row, int col) {

        // Check the same column
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

        return true;
    }

    // Backtracking function to find only one solution
    public static boolean solveNQueens(char[][] board, int row) {

        // Base case:
        // All queens have been successfully placed
        if (row == board.length) {
            return true;
        }

        // Try every column in the current row
        for (int col = 0; col < board.length; col++) {

            // Check whether the current position is safe
            if (isSafe(board, row, col)) {

                // Choose: place the queen
                board[row][col] = 'Q';

                // Explore: move to the next row
                if (solveNQueens(board, row + 1)) {
                    return true;
                }

                // Backtrack: remove the queen
                board[row][col] = '.';
            }
        }

        // No solution found from this path
        return false;
    }

    // Print the chessboard
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

        // Create the chessboard
        char[][] board = new char[n][n];

        // Initialize every cell with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Find and print only one solution
        if (solveNQueens(board, 0)) {
            System.out.println("One possible solution:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}