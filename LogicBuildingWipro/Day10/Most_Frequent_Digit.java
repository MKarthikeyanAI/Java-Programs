package LogicBuildingWipro.Day10;

import java.util.*;

public class Most_Frequent_Digit {

    // Function to find the most frequent digit across four given numbers
    public static int mostFrequentDigit(int input1, int input2, int input3, int input4) {
        // Create a map to count the frequency of each digit
        Map<Integer, Integer> digitCount = new HashMap<>();


        // Update the count for each input number
        updateDigitCount(input1,digitCount);
        updateDigitCount(input2,digitCount);
        updateDigitCount(input3,digitCount);
        updateDigitCount(input4,digitCount);

        // Find the most frequent digit
        int maxFrequency = 0;
        int mostFrequentDigit = -1;
        for (Map.Entry<Integer, Integer> entry : digitCount.entrySet()) {
            int digit = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency || (frequency == maxFrequency && digit > mostFrequentDigit)) {
                maxFrequency = frequency;
                mostFrequentDigit = digit;
            }
        }

        return mostFrequentDigit;
    }

    public static void updateDigitCount(int number,Map<Integer, Integer> digitCount) {

        while (number > 0) {
            int digit = number % 10;
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Most Frequent Digit: " + mostFrequentDigit(123, 234, 345, 673)); // Output: 3
        System.out.println("Most Frequent Digit: " + mostFrequentDigit(123, 456, 345, 5043)); // Output: 5
        System.out.println("Most Frequent Digit: " + mostFrequentDigit(1203, 7624, 2046, 1052)); // Output: 2
        System.out.println("Most Frequent Digit: " + mostFrequentDigit(1203, 7624, 2046, 1002)); // Output:2
    }
}

