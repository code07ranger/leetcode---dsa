import java.util.Arrays;

class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row:nums) {
            Arrays.sort(row);
        }
        int score=0;
        for (int c=0;c<nums[0].length;c++) {
            int maxC=0;
            for (int r=0;r<nums.length;r++) {
                maxC=Math.max(maxC,nums[r][c]);
            }
            score+=maxC;
        }
        return score;
    }
}