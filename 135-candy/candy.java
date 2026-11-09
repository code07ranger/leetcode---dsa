import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        if(ratings==null || ratings.length==0){
            return 0;
        }
        int n=ratings.length;
        int[] candy=new int[n];
        Arrays.fill(candy,1);
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candy[i]=candy[i-1]+1;
            }
        }
        for (int i=n-2;i>=0;i--){
            if (ratings[i]>ratings[i+1]){
                candy[i]=Math.max(candy[i],candy[i+1]+1);
            }
        }
        int sumcandy=0;
        for (int can:candy) {
            sumcandy+=can;
        }  
    return sumcandy;
    }
}