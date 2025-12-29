class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returner = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int a = i + 1; a < nums.length; a++) {
                if (nums[i] + nums[a] == target) {
                    returner[0] = i;
                    returner[1] = a;
                    return returner;
                }
            }
        }
        return new int[]{}; // return empty array if no solution found
    }
}