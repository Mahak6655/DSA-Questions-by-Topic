public class factorial {

    // Recursive method to calculate the factorial of a number
    public static int printFactorial(int n) {

        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n × (n - 1)!
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {

        // Calculate and print the factorial of 5
        System.out.println(printFactorial(5));
    }
}