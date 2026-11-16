class Solution {
    public char findTheDifference(String s, String t) {
        boolean[] visited=new boolean[s.length()];
        for(int i=0;i<t.length();i++){
            char curr=t.charAt(i);
            boolean found=false;
            for(int j=0;j<s.length();j++){
                if(!visited[j] && s.charAt(j)==curr){
                    visited[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found){
                return curr;
            }
        }
    return ' '; 
    }
}