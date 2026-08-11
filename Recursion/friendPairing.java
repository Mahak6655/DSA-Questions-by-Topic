public class friendPairing {

    // Recursive method to calculate the number of ways
    // n friends can remain single or pair up
    public static int friendsPairingProblem(int n) {

        // Base case:
        // For 1 friend, there is 1 way.
        // For 2 friends, there are 2 ways:
        // both remain single OR they pair together.
        if (n == 1 || n == 2) {
            return n;
        }

        // Two choices:
        // 1. The current friend remains single -> f(n-1)
        // 2. The current friend pairs with any of the remaining (n-1) friends
        //    -> (n-1) * f(n-2)
        return friendsPairingProblem(n - 1)
                + (n - 1) * friendsPairingProblem(n - 2);
    }

    public static void main(String[] args) {

        // Calculate and print the number of pairing possibilities for 3 friends
        System.out.println(friendsPairingProblem(3));
    }
}