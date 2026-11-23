class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
                if (nums.length < 3) {
            return 0;
        }
        int t = 0;
        int c = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                c += 1;
                t += c;
            } else {
                c = 0;
            }
        }
        return t;
    }
}