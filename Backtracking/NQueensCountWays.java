public class NQueensCountWays {

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

    // Backtracking function to count all possible solutions
    public static int countWays(char[][] board, int row) {

        // Base case:
        // All queens have been successfully placed
        if (row == board.length) {
            return 1;
        }

        int count = 0;

        // Try placing the queen in every column
        for (int col = 0; col < board.length; col++) {

            // Check whether the current position is safe
            if (isSafe(board, row, col)) {

                // Choose: place the queen
                board[row][col] = 'Q';

                // Explore: move to the next row
                count += countWays(board, row + 1);

                // Backtrack: remove the queen
                board[row][col] = '.';
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Size of the chessboard
        int n = 4;

        // Create an empty chessboard
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Count and print the total number of solutions
        System.out.println("Total ways: " + countWays(board, 0));
    }
}