class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2 * n];
        int r=n+1;
        for(int l=0;l<n;l++){
            arr[2*l] =nums[l];
            arr[2*l+1] =nums[n+l];
        }
        return arr;
    }
}