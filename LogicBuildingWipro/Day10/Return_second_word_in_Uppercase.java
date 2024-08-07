package LogicBuildingWipro.Day10;



public class Return_second_word_in_Uppercase {

    // Function to extract the second word from a sentence and convert it to uppercase
    public static String getSecondWordInUppercase(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "LESS";
        }

        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+");

        // Check if there are at least two words
        if (words.length < 2) {
            return "LESS";
        }

        // Get the second word and convert it to uppercase
        return words[1].toUpperCase();
    }

    static void getWord(String word){
        String[] w = word.split(" ");

        if(w.length<=1){
            System.out.println("There is only one word");
        }
        else {
            System.out.println(w[1].toUpperCase());
        }

    }
    public static void main(String[] args) {
        // Example usage
        System.out.println("Result: " + getSecondWordInUppercase("Wipro Technologies Bangalore")); // Output: "TECHNOLOGIES"
        System.out.println("Result: " + getSecondWordInUppercase("Hello World")); // Output: "WORLD"
        System.out.println("Result: " + getSecondWordInUppercase("Championship 2017 League")); // Output: "2017"
        System.out.println("Result: " + getSecondWordInUppercase("Hello")); // Output: "LESS"
        getWord("Kar keyan world");
    }
}