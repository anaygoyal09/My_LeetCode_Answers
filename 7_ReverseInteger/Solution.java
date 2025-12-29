class Solution {
    public int reverse(int x) {
        String a = Integer.toString(x);
        String r = "";

        // If negative, skip the '-' while reversing
        if (x < 0) {
            r += "-";
            for (int i = a.length() - 1; i >= 1; i--) {
                r += a.charAt(i);
            }
        } 
        else {
            for (int i = a.length() - 1; i >= 0; i--) {
                r += a.charAt(i);
            }
        }

       try {
            return Integer.parseInt(r);
        } catch (NumberFormatException e) {
            return 0; // overflow case
        }
    }
}