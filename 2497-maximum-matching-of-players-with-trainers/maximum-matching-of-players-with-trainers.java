class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int idx1=0;
        int idx2=0;
        int matches=0;
        while (idx1<players.length && idx2<trainers.length){
            if(players[idx1]<=trainers[idx2]){
                matches++;
                idx1++;
                idx2++;
            } 
            else{
                idx2++;
            }
        }
    return matches;
    }
}