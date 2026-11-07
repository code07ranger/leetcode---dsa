class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int rST=Math.max(0,i-k);
                int rE=Math.min(m-1,i+k);
                int cST=Math.max(0,j-k);
                int cE=Math.min(n-1,j+k);
                int sum=0;
                for (int r=rST;r<=rE;r++) {
                    for (int c=cST;c<=cE;c++) {
                        sum+=mat[r][c];
                    }
                }
            ans[i][j]=sum;
            }
        }
    return ans;
    }
}