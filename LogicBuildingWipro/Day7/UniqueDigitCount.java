package LogicBuildingWipro.Day7;
import java.util.*;
public class UniqueDigitCount {
    // Function to count the number of unique digits in a given number
    public static int countUniqueDigits(int number) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }

        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Use a set to store unique digits
        Set<Character> uniqueDigits = new HashSet<>();

        // Iterate through each character in the string and add it to the set
        for (char digit : numStr.toCharArray()) {
            uniqueDigits.add(digit);
        }

        // The size of the set is the number of unique digits
        return uniqueDigits.size();
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Unique digits in 292: " + countUniqueDigits(292));  // Output: 2
        System.out.println("Unique digits in 1015: " + countUniqueDigits(1015)); // Output: 3
}

}
