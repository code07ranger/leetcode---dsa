class Solution {
    public String arrangeWords(String text) {
        String[] ans=text.toLowerCase().split(" ");
        int n = ans.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(ans[j].length()>ans[j + 1].length()){
                    String temp=ans[j];
                    ans[j]=ans[j + 1];
                    ans[j + 1]=temp;
                }
            }
        }
    ans[0]=Character.toUpperCase(ans[0].charAt(0))+ans[0].substring(1);
    return String.join(" ",ans);
    }
}