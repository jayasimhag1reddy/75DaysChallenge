package day39;

import java.util.Arrays;

//https://leetcode.com/problems/out-of-boundary-paths/
public class Problem576 {
    public int findPaths(int m, int n, int max, int r, int c) {
        int[][][] dp=new int[m][n][max+1];
        for(int[][] ar:dp){
            for(int[] ma:ar)
                Arrays.fill(ma,-1);
        }
        return helper(r,c,m,n,max,dp)%1000000007;
    }
    public int helper(int i,int j,int m,int n,int max,int[][][] dp){
        if(i<0 || i>=m || j<0 || j>=n){
            return 1;
        }
        if(max<=0)return 0;
        if(dp[i][j][max]!=-1)return dp[i][j][max]%1000000007;
        int u=helper(i+1,j,m,n,max-1,dp);
        int d=helper(i,j+1,m,n,max-1,dp);
        int l=helper(i-1,j,m,n,max-1,dp);
        int r=helper(i,j-1,m,n,max-1,dp);
        return dp[i][j][max]=(((u%1000000007)+(d%1000000007))%1000000007+((l%1000000007)+(r%1000000007))%1000000007)%1000000007;
    }
}
