package day38;
//https://leetcode.com/problems/unique-paths/
public class Problem62 {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1)dp[i][j]=1;
                else{
                    int down=0,right=0;
                    if(j<n-1)right=dp[i][j+1];
                    if(i<m-1)down=dp[i+1][j];
                    dp[i][j]=down+right;
                }
            }
        }
        return dp[0][0];
    }
}
