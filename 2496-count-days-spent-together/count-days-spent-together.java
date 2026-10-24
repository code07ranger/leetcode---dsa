class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aS=dayOfYear(arriveAlice);
        int aE=dayOfYear(leaveAlice);
        int bS=dayOfYear(arriveBob);
        int bE=dayOfYear(leaveBob);
        
        int start=Math.max(aS,bS);
        int end=Math.min(aE,bE);
        
        if(start>end){
            return 0;
        }
        return end-start+1;
    }
    private int dayOfYear(String date){
        int[] daysInMonth={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m=Integer.parseInt(date.substring(0,2));
        int d=Integer.parseInt(date.substring(3,5));
        int tD=d;
        for(int i=0;i<m-1;i++){
            tD+=daysInMonth[i];
        }
        return tD;
    }
}