import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class mostFrequent {
    public static int findMostFrequentElement(int[] nums) {
        // Step 1: Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Count the frequency of each number in the array
        for (int num : nums) {
            // If the number is already in the map, increase its count by 1
            // Otherwise, add it to the map with a count of 1
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Find the number with the highest frequency
        int mostFrequentElement = Integer.MAX_VALUE; // Start with the largest possible value
        int maxFrequency = 0; // Start with a frequency of 0

        // Iterate through the map to find the most frequent element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            // Update the most frequent element if:
            // 1. The current frequency is higher than the max frequency found so far
            // 2. The current frequency is the same but the element is smaller
            if (frequency > maxFrequency || (frequency == maxFrequency && element < mostFrequentElement)) {
                mostFrequentElement = element;
                maxFrequency = frequency;
            }
        }

        return mostFrequentElement; // Return the most frequent element
    }

    public static void main(String[] args) {
        int[] input = {1, 10, 10, 1, 10, 3, 6}; // Example input array
        System.out.println(findMostFrequentElement(input)); // Output should be 10
    }
}

