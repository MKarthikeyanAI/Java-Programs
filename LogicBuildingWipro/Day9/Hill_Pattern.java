package LogicBuildingWipro.Day9;

public class Hill_Pattern {
    // Function to calculate the total weight of the hill pattern
    public static int calculateTotalWeight(int totalLevels, int headLevelWeight, int weightIncrement) {
        if (totalLevels < 1 || headLevelWeight < 1 || weightIncrement < 0) {
            throw new IllegalArgumentException("Invalid input. Ensure totalLevels >= 1, headLevelWeight >= 1, and weightIncrement >= 0.");
        }

        int totalWeight = 0;

        // Calculate the weight for each level and accumulate
        for (int level = 1; level <= totalLevels; level++) {
            int currentLevelWeight = headLevelWeight + (level - 1) * weightIncrement;
            int levelWeight = level * currentLevelWeight;
            totalWeight += levelWeight;
        }

        return totalWeight;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Total weight for 5 levels, head level weight 10, increment 2: " +
                calculateTotalWeight(5, 10, 2)); // Output: 230
        System.out.println("Total weight for 4 levels, head level weight 1, increment 5: " +
                calculateTotalWeight(4, 1, 5));  // Output:110
    }

}
