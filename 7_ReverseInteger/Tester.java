public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("123 -> " + solution.reverse(123)); // Expected: 321
        System.out.println("-123 -> " + solution.reverse(-123)); // Expected: -321
        System.out.println("120 -> " + solution.reverse(120)); // Expected: 21
    }
}
