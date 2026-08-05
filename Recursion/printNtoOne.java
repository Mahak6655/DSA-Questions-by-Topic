public class printNtoOne {

    // Recursive method to print numbers from N to 1
    public static void printNTOOne(int n) {

        // Base case: when n becomes 1, print it and stop recursion
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        // Print the current number
        System.out.print(n + " ");

        // Recursive call to print the remaining numbers
        printNTOOne(n - 1);
    }

    public static void main(String[] args) {

        // Print numbers from 10 to 1
        printNTOOne(10);
    }
}