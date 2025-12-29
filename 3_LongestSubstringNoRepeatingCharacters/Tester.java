public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("abcabcbb -> " + solution.lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println("bbbbb -> " + solution.lengthOfLongestSubstring("bbbbb")); // Expected: 1
        System.out.println("pwwkew -> " + solution.lengthOfLongestSubstring("pwwkew")); // Expected: 3
    }
}
