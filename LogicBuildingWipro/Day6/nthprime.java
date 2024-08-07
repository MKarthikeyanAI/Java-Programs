package LogicBuildingWipro.Day6;

public class nthprime {
    // Helper function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the Nth prime number
    public static int nthPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N must be greater than or equal to 1");
        }

        int count = 0;
        int number = 1;
        while (count < n) {
            number++;
            System.out.println("Number: "+number);
            if (isPrime(number)) {
                count++;
                System.out.println(count);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        // Example usage:
//        System.out.println("10th prime number: " + nthPrime(1000)); // Output: 29
        System.out.println("13th prime number: " + nthPrime(10)); // Output: 41
    }
}
