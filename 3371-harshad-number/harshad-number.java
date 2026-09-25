class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int og=x;
        int sum=0;
        while(og!=0){
            int a=og%10;
            sum+=a;
            og/=10;
        }
        if((x%sum)==0){
            return sum;
        }
        return -1;
    }
}