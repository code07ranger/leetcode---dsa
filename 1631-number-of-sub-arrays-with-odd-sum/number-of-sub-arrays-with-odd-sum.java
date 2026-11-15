class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD=1_000_000_007;
        int odd=0;
        int even=1;
        int ans=0;
        int preSum=0;
        for(int ele:arr){
            preSum+=ele;
            if((preSum & 1)==1){
                ans=(ans+even)%MOD;
                odd++;
            } 
            else{
                ans=(ans+odd)%MOD;
                even++;
            }
        }
    return ans;
    }
}