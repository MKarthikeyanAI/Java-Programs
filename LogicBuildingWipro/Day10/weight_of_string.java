package LogicBuildingWipro.Day10;

public class weight_of_string {
    // Function to calculate the weight of the string based on the option for vowels
    public static int calculateWeight(String input, int includeVowels) {
        if (input == null) {
            return 0; // Handle null input
        }

        int totalWeight = 0;
        input = input.toLowerCase(); // Convert to lowercase to handle case insensitivity

        // Loop through each character in the string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                int weight = ch - 'a' + 1; // Calculate weight of the letter
                if (includeVowels == 0 && "aeiou".indexOf(ch) != -1) {
                    System.out.println();
                    // Ignore vowel weight if includeVowels is 0
                    continue;
                }
                totalWeight += weight; // Add weight to totalWeight
            }
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Weight (Hello World, include vowels): " + calculateWeight("Hello World", 1)); // Output: 124
        System.out.println("Weight (Hello World, ignore vowels): " + calculateWeight("Hello World", 0)); // Output: 89
        System.out.println("Weight (All Zebras are Black & White, ignore vowels): " + calculateWeight("All Zebras are Black & White!!", 0)); // Output: 186
    }

}
