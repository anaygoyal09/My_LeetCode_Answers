public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("121 -> " + solution.isPalindrome(121)); // Expected: true
        System.out.println("-121 -> " + solution.isPalindrome(-121)); // Expected: false
        System.out.println("10 -> " + solution.isPalindrome(10)); // Expected: false
    }
}
