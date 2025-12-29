public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("babad -> " + solution.longestPalindrome("babad")); // Expected: "bab" or "aba"
        System.out.println("cbbd -> " + solution.longestPalindrome("cbbd")); // Expected: "bb"
    }
}
