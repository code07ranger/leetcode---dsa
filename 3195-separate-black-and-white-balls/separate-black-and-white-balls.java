class Solution {
    public long minimumSteps(String s) {
        long Swap=0;
        int black=0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                black++;
            } 
            else{
                Swap+=black;
            }
        }
        return Swap;
    }
}