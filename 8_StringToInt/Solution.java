class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        int i = 0;
        int n = s.length();

        // skip spaces
        while (i < n && s.charAt(i) == ' ') i++;

        if (i == n) return 0;

        // sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        int maxDiv = Integer.MAX_VALUE / 10;
        int maxMod = Integer.MAX_VALUE % 10;

        while (i < n) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break;

            int digit = ch - '0';

            // overflow check
            if (result > maxDiv || (result == maxDiv && digit > maxMod)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
}