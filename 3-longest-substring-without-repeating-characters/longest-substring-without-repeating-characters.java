class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lS=new int[128];
        java.util.Arrays.fill(lS,-1);
        int mL=0;
        int l=0;
        for (int r=0;r<s.length();r++) {
            char cC=s.charAt(r);
            if (lS[cC]>=l) {
                l=lS[cC]+1;
            }
            lS[cC]=r;
            mL=Math.max(mL,r-l+1);
        }
        return mL;
    }
}