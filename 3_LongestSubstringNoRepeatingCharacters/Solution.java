class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int current = 0;
        String used = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // check if current char is already in "used"
            int idx = used.indexOf(c);
            if (idx != -1) {
                // cut off everything up to and including the repeated char
                used = used.substring(idx + 1);
                current = used.length();
            }

            // add current char
            used += c;
            current++;
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}