package LogicBuildingWipro.Day8;

public class Evenorodddigitsum {
    // Function to compute the sum of either even or odd digits based on the option
    public static int evenOrOddDigitsSum(int number, String option) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }
        if (!option.equals("even") && !option.equals("odd")) {
            throw new IllegalArgumentException("Option must be either 'even' or 'odd'.");
        }

        int sum = 0;

        // Convert the number to a string to process each digit
        String numStr = Integer.toString(number);

        // Iterate over each character in the string
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); // Convert char to int
            if (option.equals("even") && digit % 2 == 0) { // Check if the digit is even
                sum += digit;
            } else if (option.equals("odd") && digit % 2 != 0) { // Check if the digit is odd
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Sum of odd digits in 9625: " + evenOrOddDigitsSum(9625, "odd")); // Output: 14
        System.out.println("Sum of even digits in 2134: " + evenOrOddDigitsSum(2134, "even")); // Output: 6
    }

}
