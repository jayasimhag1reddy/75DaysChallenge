package day38;
//https://leetcode.com/problems/minimum-path-sum/
public class Problem64 {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1)dp[i][j]=grid[i][j];
                else{
                    int right=40001;
                    int down=40001;
                    if(j<n-1)right=grid[i][j]+dp[i][j+1];
                    if(i<m-1)down=grid[i][j]+dp[i+1][j];
                    dp[i][j]=Math.min(right,down);
                }
            }
        }
        return dp[0][0];
        //return helper(0,0,m-1,n-1,grid,dp);
    }
    // public int helper(int i,int j,int m,int n,int[][] grid,int[][] dp){
    //     if(i==m && j==n){
    //         return grid[i][j];
    //     }
    //     if(i>m || j>n){
    //         return 40001;
    //     }
    //     if(dp[i][j]!=-1)return dp[i][j];
    //     int right=grid[i][j]+helper(i,j+1,m,n,grid,dp);
    //     int down=grid[i][j]+helper(i+1,j,m,n,grid,dp);
    //     return dp[i][j]=Math.min(right,down);
    // }
}
