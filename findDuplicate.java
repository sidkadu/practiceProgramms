import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        // Initialize array with numbers including duplicates
        int[] nums = {4, 2, 7, 9, 2, 7, 1};
        
        // Set to track seen numbers
        Set<Integer> seen = new HashSet<>();
        
        // Set to store duplicate numbers
        Set<Integer> duplicates = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // Try to add number to 'seen' set
            // If already present (add returns false), add to duplicates
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Print the duplicate elements found
        System.out.println("Duplicate elements: " + duplicates);
    }
}
