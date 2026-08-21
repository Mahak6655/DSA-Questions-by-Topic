public class GridWays {

    // Recursive function to count the number of ways
    // to reach the destination from the current cell
    public static int countWays(int i, int j, int n, int m) {

        // Base case:
        // Reached the destination cell
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // If we move outside the grid, there is no valid path
        if (i >= n || j >= m) {
            return 0;
        }

        // Move Right
        int rightWays = countWays(i, j + 1, n, m);

        // Move Down
        int downWays = countWays(i + 1, j, n, m);

        // Total ways = ways by moving right + ways by moving down
        return rightWays + downWays;
    }

    public static void main(String[] args) {

        // Number of rows and columns
        int n = 3;
        int m = 3;

        // Start from (0,0)
        System.out.println("Total ways: " + countWays(0, 0, n, m));
    }
}