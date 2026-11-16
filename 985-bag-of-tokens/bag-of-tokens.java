class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxsc=0;
        int sc=0;
        int l=0;
        int r=tokens.length-1;
        while(l<=r){
            // Play face-up: spend power to gain score
            if(power>=tokens[l]){
                power-=tokens[l];
                sc++;
                l++;
                maxsc=Math.max(maxsc,sc);
            } 
            // Play face-down: spend score to gain power (only if more tokens remain)
            else if(sc>0 && l<r){
                power+=tokens[r];
                sc--;
                r--;
            } 
            // Cannot make any valid move
            else {
                break;
            }
        }
        return maxsc;
    }
}