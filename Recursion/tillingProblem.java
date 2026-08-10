public class tillingProblem {

    // Recursive method to find the number of ways to tile a 2 x n floor
    // using 2 x 1 tiles
    public static int tillingProblemSol(int n) {

        // Base case:
        // For n = 0 or n = 1, there is only 1 way to arrange the tiles
        if (n == 0 || n == 1) {
            return 1;
        }

        // Two choices:
        // 1. Place a tile vertically -> solve for n - 1
        // 2. Place two tiles horizontally -> solve for n - 2
        return tillingProblemSol(n - 1) + tillingProblemSol(n - 2);
    }

    public static void main(String[] args) {

        // Calculate the number of ways to tile a 2 x 4 floor
        System.out.println(tillingProblemSol(4));
    }
}