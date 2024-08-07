package LogicBuildingWipro.Day10;

public class isPalindrome {
    public static int isPalindrome(String input) {
        // Convert the input string to lowercase to ignore case sensitivity
        String lowerCaseInput = input.toLowerCase();

        // Initialize two pointers, one at the start and one at the end of the string
        int left = 0;
        int right = lowerCaseInput.length() - 1;

        // Compare characters from both ends towards the center
        while (left < right) {
            if (lowerCaseInput.charAt(left) != lowerCaseInput.charAt(right)) {
                return 1; // Not a palindrome
            }
            left++;
            right--;
        }
        return 2; // Palindrome
    }

    public static void main(String[] args) {
        System.out.println("Is 'madam' a palindrome? " + isPalindrome("madam")); // Output: 2
        System.out.println("Is 'hello' a palindrome? " + isPalindrome("hello")); // Output: 1
    }
}

