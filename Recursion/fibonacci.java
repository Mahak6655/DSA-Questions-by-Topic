public class fibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int printFibonacciNum(int n) {

        // Base case: the 0th Fibonacci number is 0
        // and the 1st Fibonacci number is 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Recursive case:
        // F(n) = F(n - 1) + F(n - 2)
        return printFibonacciNum(n - 1) + printFibonacciNum(n - 2);
    }

    public static void main(String[] args) {

        // Find and print the 5th Fibonacci number
        System.out.println(printFibonacciNum(5));
    }
}