import java.util.Arrays;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0;
        for(int i=0;i<=satisfaction.length;i++){
            int like=0;
            int time=1;
            for(int j=i;j<satisfaction.length;j++){
                like+=satisfaction[j]*time;
                time++;
            }  
            max=Math.max(max,like);
        } 
    return max;
    }
}