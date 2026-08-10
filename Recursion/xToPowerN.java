public class xToPowerN {

    // Recursive method to calculate x raised to the power n
    public static int powerFunction(int x, int n) {

        // Base case: any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: x^n = x * x^(n-1)
        return x * powerFunction(x, n - 1);
    }

    // Optimized recursive method to calculate x^n
    // using the divide-and-conquer approach
    public static int powerFunctionOptimized(int x, int n) {

        // Base case: any number raised to the power 0 is 1
        if (n == 0) {
            return 1;
        }

        // Calculate x^(n/2) recursively
        int halfPow = powerFunctionOptimized(x, n / 2);

        // Square x^(n/2) to get x^n for even n
        int halfPowSqu = halfPow * halfPow;

        // If n is odd, multiply the result by x once more
        if (n % 2 != 0) {
            halfPowSqu = x * halfPowSqu;
        }

        return halfPowSqu;
    }

    public static void main(String[] args) {

        // Calculate 2^5 using the normal recursive approach
        System.out.println(powerFunction(2, 5));

        // Calculate 2^10 using the optimized recursive approach
        System.out.println(powerFunctionOptimized(2, 10));
    }
}