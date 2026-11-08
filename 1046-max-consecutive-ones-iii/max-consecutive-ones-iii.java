class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int zero=0;
        int maxLen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
    return maxLen;
    }
}