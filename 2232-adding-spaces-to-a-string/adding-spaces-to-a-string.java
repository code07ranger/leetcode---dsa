class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s.length()+spaces.length);
        int spidx=0;
        for(int i=0;i<s.length();i++){
            if (spidx<spaces.length && i==spaces[spidx]) {
                sb.append(' ');
                spidx++;
            }
            sb.append(s.charAt(i)); 
        }
        return sb.toString();
    }
}