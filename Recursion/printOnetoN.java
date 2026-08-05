public class printOnetoN {

    // Recursive method to print numbers from 1 to N
    public static void printOneToN(int n) {

        // Base case: when n becomes 1, print it and stop recursion
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        // Recursive call to print smaller numbers first
        printOneToN(n - 1);

        // Print the current number while returning from recursion
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        // Print numbers from 1 to 5
        printOneToN(5);
    }
}