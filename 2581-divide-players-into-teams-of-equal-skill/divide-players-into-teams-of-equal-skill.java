class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n=skill.length;
        int ts=skill[0]+skill[n-1];  //total skill for team dividing
        long tc=0;  //total chemistry from skills
        int l=0,r=n-1;
        while(l<r){
            if(skill[l]+skill[r]!=ts){
                return -1;
            }
            tc+=(long)skill[l]*skill[r];
            l++;
            r--;
        }
        return tc;
    }
}