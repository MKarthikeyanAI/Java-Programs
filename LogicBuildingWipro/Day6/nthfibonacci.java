package LogicBuildingWipro.Day6;

public class nthfibonacci {
    public static int nthFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        if (n == 1) {
            return 0; // First Fibonacci number
        }
        if (n == 2) {
            return 1; // Second Fibonacci number
        }

        int a = 0; // F(1)
        int b = 1; // F(2)
        int c = 0; // To store the current Fibonacci number

        for (int i = 3; i <= n; i++) {
            c = a + b; // Calculate the next Fibonacci number
            a = b;     // Move forward in the sequence
            b = c;
            System.out.print(c+" ");
        }

        return c;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("3rd Fibonacci number: " + nthFibonacci(3));  // Output: 1
        System.out.println("5th Fibonacci number: " + nthFibonacci(15));  // Output: 3
        System.out.println("7th Fibonacci number: " + nthFibonacci(7));  // Output: 8
    }
}
