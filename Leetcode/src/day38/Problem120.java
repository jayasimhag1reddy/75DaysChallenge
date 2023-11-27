package day38;

import java.util.List;

//https://leetcode.com/problems/triangle/
public class Problem120 {
    public int minimumTotal(List<List<Integer>> tri) {
        int n=tri.size();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[n-1][i]=tri.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=tri.get(i).get(j)+dp[i+1][j];
                int dg=tri.get(i).get(j)+dp[i+1][j+1];
                dp[i][j]=Math.min(d,dg);
            }
        }
        return dp[0][0];
    }
    // public int helper(int i,int j,List<List<Integer>> tri,int n,int[][] dp){
    //     if(i==n-1){
    //         return tri.get(i).get(j);
    //     }
    //     if(dp.get(i).get(j)!=-1)return dp.get(i).get(j);
    //    int d=tri.get(i).get(j)+helper(i+1,j,tri,n,dp);
    //    int dg=tri.get(i).get(j)+helper(i+1,j+1,tri,n,dp);
    //     return dp.get(i).add(j)=Math.min(d,dg);
    // }
}
