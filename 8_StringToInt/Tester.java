public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("\"42\" -> " + solution.myAtoi("42")); // Expected: 42
        System.out.println("\"   -42\" -> " + solution.myAtoi("   -42")); // Expected: -42
        System.out.println("\"4193 with words\" -> " + solution.myAtoi("4193 with words")); // Expected: 4193
    }
}
