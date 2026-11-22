class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
     Arrays.sort(nums);
    int n=nums.length;
    int i=0;
    for(int j=(n+1)/2;j<n;j++){
        if(2*nums[i]<=nums[j]){
            i++;
            }
        }
    return i*2;
    }
}