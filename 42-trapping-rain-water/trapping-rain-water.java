class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if (n<=2) return 0;
        int l=0,r=n-1;
        int lm=0,rm=0;
        int tapp=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=lm){
                    lm=height[l];
                } 
                else {
                    tapp+=lm-height[l];
                }
                l++;
            } 
            else{
                if (height[r]>=rm){
                    rm=height[r];
                } 
                else {
                    tapp+=rm-height[r];
                }
                r--;
            }
        }
        return tapp;
    }
}