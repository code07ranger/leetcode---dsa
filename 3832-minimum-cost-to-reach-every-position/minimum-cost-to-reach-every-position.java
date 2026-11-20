class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int[] ans=new int[n];
        int currmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            currmin=Math.min(currmin,cost[i]);
            ans[i]=currmin;
        } 
    return ans;
    }
}