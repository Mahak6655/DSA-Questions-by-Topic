public class sumOfNaturalNum {

    // Recursive method to calculate the sum of the first N natural numbers
    public static int sumOfFirstN(int n) {

        // Base case: the sum of the first natural number is 1
        if (n == 1) {
            return 1;
        }

        // Recursive case: sum(n) = n + sum(n - 1)
        return n + sumOfFirstN(n - 1);
    }

    public static void main(String[] args) {

        // Calculate and print the sum of the first 5 natural numbers
        System.out.println(sumOfFirstN(5));
    }
}