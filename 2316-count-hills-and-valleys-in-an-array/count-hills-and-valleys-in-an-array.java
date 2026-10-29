class Solution {
    public int countHillValley(int[] nums) {
        int c=0;
        int l=nums[0];
        for (int i=1;i<nums.length-1;i++) {
            if (l<nums[i] && nums[i]>nums[i+1]) {
                c++;
                l=nums[i];
            }
            else if (l>nums[i] && nums[i]<nums[i+1]) {
                c++;
                l=nums[i];
            }
        }
        return c;
    }
}
