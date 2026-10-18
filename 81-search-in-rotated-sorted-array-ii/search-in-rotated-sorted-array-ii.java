class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]>target) h=mid-1;
            if(nums[mid]<target) l=mid+1;
        }
        return false;
    }
}