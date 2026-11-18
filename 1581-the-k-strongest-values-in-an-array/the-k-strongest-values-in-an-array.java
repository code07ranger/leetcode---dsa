class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int n=arr.length;
        int mid=arr[(n-1)/2];
        int[] ans=new int[k];
        int l=0,r=n-1;
        int idx=0;
        while(idx<k){
            if (mid-arr[l]>arr[r]-mid){
                ans[idx++]=arr[l++];
            } else {
                ans[idx++]=arr[r--];
            }
        }
    return ans;
    }
}