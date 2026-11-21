class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if(k==0){
            return n;
        }    
        Arrays.sort(nums);
        int t=nums[n - k];
        int count=0;
        for (int num:nums) {
            if(num<t){
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}