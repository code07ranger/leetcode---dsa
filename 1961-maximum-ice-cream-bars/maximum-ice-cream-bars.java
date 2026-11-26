class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int a:costs){
            if(coins<a){
                break;
            }
            coins-=a;
            c++;
        }
     return c;
    }
}