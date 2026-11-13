class Solution {
    public int totalFruit(int[] fruits) {
        int lf=-1;   //lastfruit
        int slf=-1;  //secondlastfruit
        int lfc=0;   //lastfruitcount
        int currmax=0;
        int maxFruits=0;
        for(int fruit:fruits){
            if(fruit==lf || fruit==slf){
                currmax++;
            } 
            else {
                currmax=lfc+1;
            }
            if(fruit==lf){
                lfc++;
            } else {
                lfc=1;
                slf=lf;
                lf=fruit;
            }
        maxFruits=Math.max(maxFruits,currmax);
        }
    return maxFruits;
    }
}