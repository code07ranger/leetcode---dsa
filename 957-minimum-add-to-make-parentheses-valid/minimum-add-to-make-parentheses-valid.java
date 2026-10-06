class Solution {
    public int minAddToMakeValid(String s) {
        int openNeed=0; 
        int closeNeed=0; 
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c=='('){
                closeNeed++;
            } 
            else{
                if(closeNeed>0){
                    closeNeed--;
                } 
                else {
                    openNeed++;
                }
            }
        }
        return openNeed+closeNeed;
    }
}
