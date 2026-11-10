class Solution {
    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            while(start<end && !isVowel(chars[start])){
                start++;
            }
            while(start<end && !isVowel(chars[end])){
                end--;
            }
            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
    return new String(chars);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}