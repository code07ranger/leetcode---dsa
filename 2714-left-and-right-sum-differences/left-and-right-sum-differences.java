class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int tS=0;
        for (int num:nums) {
            tS+=num;
        }
        int lS=0;
        int rS=tS;
        for(int i=0;i<n;i++){
            rS-=nums[i]; 
            ans[i]=Math.abs(lS-rS); 
            lS+=nums[i]; 
        }
    return ans;
    }
}