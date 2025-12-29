public class Tester {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("III -> " + solution.romanToInt("III")); // Expected: 3
        System.out.println("LVIII -> " + solution.romanToInt("LVIII")); // Expected: 58
        System.out.println("MCMXCIV -> " + solution.romanToInt("MCMXCIV")); // Expected: 1994
    }
}
