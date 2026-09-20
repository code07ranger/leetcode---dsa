class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int reversePos=26-(c-'a');
            int stringPos=i+1;
            ans+=reversePos*stringPos;
        }
    return ans;
    }
}