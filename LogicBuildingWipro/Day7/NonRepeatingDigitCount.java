package LogicBuildingWipro.Day7;
import java.util.*;
public class NonRepeatingDigitCount {
    // Function to count the number of non-repeated digits in a given number
    public static int countNonRepeatedDigits(int number) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }

        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Use a map to count the frequency of each digit
        Map<Character, Integer> digitCount = new HashMap<>();

        // Count each digit
        for (char digit : numStr.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        // Count non-repeated digits
        int nonRepeatedCount = 0;
        for (int count : digitCount.values()) {
            if (count == 1) {
                nonRepeatedCount++;
            }
        }

        return nonRepeatedCount;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Non-repeated digits in 292: " + countNonRepeatedDigits(292));  // Output: 1
        System.out.println("Non-repeated digits in 1015: " + countNonRepeatedDigits(1015)); // Output: 2
        System.out.println("Non-repeated digits in 108: " + countNonRepeatedDigits(108));   // Output: 3
        System.out.println("Non-repeated digits in 22: " + countNonRepeatedDigits(22));     // Output: 0
    }

}
