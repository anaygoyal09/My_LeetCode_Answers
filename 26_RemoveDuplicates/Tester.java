import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {1, 1, 2};
        System.out.println("Test 1 Input: " + Arrays.toString(nums1));
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output k: " + k1); // Expected: 2
        System.out.println("Modified Array (first k): " + Arrays.toString(Arrays.copyOf(nums1, k1))); // Expected: [1, 2]
        System.out.println();

        // Test Case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Test 2 Input: " + Arrays.toString(nums2));
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output k: " + k2); // Expected: 5
        System.out.println("Modified Array (first k): " + Arrays.toString(Arrays.copyOf(nums2, k2))); // Expected: [0, 1, 2, 3, 4]
    }
}
