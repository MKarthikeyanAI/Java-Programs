package LogicBuildingWipro.Day8;

public class sum_of_digits_N {
    public static int evenDigitsSum(int number) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }

        int sum = 0;

        // Convert the number to a string to process each digit
        String numStr = Integer.toString(number);

        // Iterate over each character in the string
        for (char digitChar : numStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); // Convert char to int
                sum += digit;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Even digits sum of 9625: " + evenDigitsSum(9625)); // Output: 8
        System.out.println("Even digits sum of 2134: " + evenDigitsSum(2134)); // Output: 6
    }
}
