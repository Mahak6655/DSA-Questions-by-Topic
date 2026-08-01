package String;

public class getShortestPath {

    // Method to calculate the shortest distance from the origin (0,0)
    // after following the given path
    public static float shorestPath(String path) {
        int x = 0;
        int y = 0;

        // Traverse each direction in the path
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            // Move South
            if (dir == 'S') {
                y--;
            }
            // Move North
            else if (dir == 'N') {
                y++;
            }
            // Move East
            else if (dir == 'E') {
                x++;
            }
            // Move West
            else if (dir == 'W') {
                x--;
            }
        }

        // Calculate x² + y²
        int xSquare = x * x;
        int ySquare = y * y;

        // Return the shortest distance using the distance formula
        return (float) Math.sqrt(xSquare + ySquare);
    }

    public static void main(String[] args) {

        // Example path
        String str = "WNEENESENNN";

        // Print the shortest distance from the origin
        System.out.println(shorestPath(str));
    }
}

// Time Complexity
// Time: O(n) — Traverses the string once.
// Space: O(1) — Uses only a few variables.