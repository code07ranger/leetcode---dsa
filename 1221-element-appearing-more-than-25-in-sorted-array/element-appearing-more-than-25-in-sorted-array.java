class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int q=n/4;
        for(int i=0;i<n-q;i++){
            if(arr[i]==arr[i+q]){
                return arr[i];
            }
        }
     return -1;
    }
}