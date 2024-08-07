package LogicBuildingWipro.Day9;
import java.util.*;
public class is_Palindrome_Possible {
    // Function to check if it is possible to rearrange the digits to form a palindrome
    public static int isPalindromePossible(int number) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }

        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Map to count occurrences of each digit
        Map<Character, Integer> digitCount = new HashMap<>();

        // Count occurrences of each digit
        for (char digitChar : numStr.toCharArray()) {
            digitCount.put(digitChar, digitCount.getOrDefault(digitChar, 0) + 1);
        }

        // Count how many digits have an odd count
        int oddCount = 0;
        for (int count : digitCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A palindrome can be formed if at most one digit has an odd count
        return oddCount > 1 ? 1 : 2;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Is palindrome possible for 21251? " + isPalindromePossible(21251)); // Output: 2
        System.out.println("Is palindrome possible for 2125? " + isPalindromePossible(2125));  // Output:1
}

}
