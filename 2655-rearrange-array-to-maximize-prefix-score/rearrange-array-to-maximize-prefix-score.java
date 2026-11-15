class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long presum=0;
        int maxsc=0;
        for(int i=nums.length-1;i>=0;i--){
            presum+=nums[i];
            if(presum>0){
                maxsc++;
            } 
            else{
                break;
            }
        }
        return maxsc;
    }
}