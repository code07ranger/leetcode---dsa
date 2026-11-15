class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int minst=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=0;j<n;j++){
                if(intervals[j][0]>=intervals[i][1]){
                    if(intervals[j][0]<minst){
                        minst=intervals[j][0];
                        minidx=j;
                    }
                }
            }
        ans[i]=minidx;
        }
    return ans;
    }
}