class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k<=1) return 0;
        int subarr=0;
        int cP=1;
        int l=0;
        for(int r=0;r<nums.length;r++){
            cP*=nums[r];
            while(cP>=k){
                cP/=nums[l];
                l++;
            }
            subarr+=(r-l+1);
        }
        return subarr;
    }
}