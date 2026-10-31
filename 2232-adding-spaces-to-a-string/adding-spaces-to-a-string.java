class Solution {
    public String addSpaces(String s, int[] spaces) {
        String result = ""; 
        StringBuilder sb = new StringBuilder(s);
        int offset = 0;
        for (int space : spaces) {
            sb.insert(space + offset, ' ');
            offset++;
        }
        return sb.toString();
    }
}