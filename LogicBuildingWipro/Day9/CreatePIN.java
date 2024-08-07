package LogicBuildingWipro.Day9;

public class CreatePIN {
    // Function to generate a PIN based on three input numbers
    public static int generatePin(int input1, int input2, int input3) {
        if (input1 < 100 || input1 > 999 ||
                input2 < 100 || input2 > 999 ||
                input3 < 100 || input3 > 999) {
            throw new IllegalArgumentException("Each input must be a three-digit number between 100 and 999.");
        }

        // Find the smallest units, tens, and hundreds positions
        int minUnit = Math.min(Math.min(input1 % 10, input2 % 10), input3 % 10);
        int minTens = Math.min(Math.min((input1 / 10) % 10, (input2 / 10) % 10), (input3 / 10) % 10);
        int minHundreds = Math.min(Math.min(input1 / 100, input2 / 100), input3 / 100);

        // Find the maximum digit from all three numbers
        int maxDigit = findMaxDigit(input1, input2, input3);

        // Create the PIN
        int pin = maxDigit * 1000 + minHundreds * 100 + minTens * 10 + minUnit;

        return pin;
    }

    // Helper function to find the maximum digit among all digits in the numbers
    private static int findMaxDigit(int num1, int num2, int num3) {
        int maxDigit = 0;
        for (int num : new int[] { num1, num2, num3 }) {
            while (num > 0) {
                int digit = num % 10;
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
                num /= 10;
            }
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("PIN for inputs 123, 582, 175: " + generatePin(123, 582, 175)); // Output: 8122
        System.out.println("PIN for inputs 190, 267, 853: " + generatePin(190, 267, 853)); // Output:9320}
    }
}
