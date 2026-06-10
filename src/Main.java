/**
 * The Main class contains methods for computing Fibonacci numbers
 * and demonstrates the functionality in the main method.
 */
public class Main {

    /**
     * Calculates the nth term of the Fibonacci sequence using recursion.
     *
     * @param n the position in the Fibonacci sequence to compute
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * The entry point of the application. Calls the fibonacci method
     * with n = 10 and prints the result.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int term = 10;
        int result = fibonacci(term);
        System.out.println("The " + term + "th term of the Fibonacci sequence is " + result + ".");

        // minor update for enhancement branch

    }
}
