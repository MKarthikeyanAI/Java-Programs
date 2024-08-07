package LogicBuildingWipro.Day9;

public class is_Palindrome_Number {
    // Function to check if the given number is a palindrome
    public static int isPalindrome(int number) {
        if (number < 1 || number > 25000) {
            throw new IllegalArgumentException("Number must be between 1 and 25000, inclusive.");
        }

        // Convert the number to a string to simplify checking
        String numStr = Integer.toString(number);
        int left = 0;
        int right = numStr.length() - 1;

        // Check characters from both ends towards the center
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return 1; // Not a palindrome
            }
            left++;
            right--;
        }

        return 2; // Is a palindrome
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Is 252 a palindrome? " + isPalindrome(252));   // Output: 2
        System.out.println("Is 18981 a palindrome? " + isPalindrome(18981)); // Output: 2
        System.out.println("Is 5005 a palindrome? " + isPalindrome(5005));   // Output: 2
        System.out.println("Is 12345 a palindrome? " + isPalindrome(12345)); // Output:1
}

}
