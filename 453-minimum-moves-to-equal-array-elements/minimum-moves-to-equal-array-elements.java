class Solution {
    public int minMoves(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int min = nums[0];
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
            if (num < min) {
                min = num;
            }
        }
        return (int) (sum - (int) min * nums.length);
    }
}
