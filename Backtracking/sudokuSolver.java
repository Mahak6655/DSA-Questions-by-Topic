public class sudokuSolver {

    // Check whether placing the given digit is safe
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // Check the same row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check the same column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Find the starting row and column of the 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        // Check the 3x3 sub-grid
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        // Digit can be safely placed
        return true;
    }

    // Backtracking function to solve the Sudoku
    public static boolean solveSudoku(int sudoku[][], int row, int col) {

        // If all rows are completed, Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Move to the next row after completing the current row
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow++;
            nextCol = 0;
        }

        // If the current cell is already filled,
        // move to the next cell
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }

        // Try digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {

            // Check whether the digit can be placed
            if (isSafe(sudoku, row, col, digit)) {

                // Choose: place the digit
                sudoku[row][col] = digit;

                // Explore: recursively solve the remaining Sudoku
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack: remove the digit
                sudoku[row][col] = 0;
            }
        }

        // No digit can be placed in this cell
        return false;
    }

    // Function to print the Sudoku board
    public static void printSudoku(int sudoku[][]) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 0 represents an empty cell
        int sudoku[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // Example Sudoku
        int board[][] = {
            {0, 0, 0, 0, 6, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        // Solve and print the Sudoku
        if (solveSudoku(board, 0, 0)) {
            System.out.println("Sudoku Solution:");
            printSudoku(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

