package day6;
//https://leetcode.com/problems/range-sum-query-2d-immutable/
public class NumMatrix {
    int[][] presum;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        presum=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                presum[i][j]=presum[i-1][j]+presum[i][j-1]-presum[i-1][j-1]+matrix[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;col1++;row2++;col2++;
        return presum[row2][col2]-presum[row2][col1-1]-presum[row1-1][col2]+presum[row1-1][col1-1];
    }
}
