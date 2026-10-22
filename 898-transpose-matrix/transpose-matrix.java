class Solution {
    public int[][] transpose(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        int[][] mat=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[j][i]=arr[i][j];
            }
        }
        return mat;
    }
}