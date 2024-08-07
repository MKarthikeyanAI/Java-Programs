package LogicBuildingWipro.Day7;

public class PrimeRangeCounter {
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

    // Function to count prime numbers in a specified range
    public static int countPrimesInRange(int start, int end) {
        if (start < 2 || end < start) {
            throw new IllegalArgumentException("Invalid range. Ensure 2 <= start <= end and start <= end.");
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Number of primes between 2 and 20: " + countPrimesInRange(2, 20)); // Output: 8
        System.out.println("Number of primes between 700 and 725: " + countPrimesInRange(700, 725)); // Output: 3
    }
}
