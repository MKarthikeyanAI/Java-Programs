package LogicBuildingWipro.Day6;

public class factorialofN {
    public static int factorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input must be >= 1");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Factorial of 5: " + factorial(5));  // Output: 120
        System.out.println("Factorial of 4: " + factorial(4));  // Output: 24
        System.out.println("Factorial of 9: " + factorial(9));  // Output: 362880
    }
}
