package day17;

import java.util.Arrays;

//https://leetcode.com/problems/longest-ideal-subsequence/
public class Problem2370 {
    public int longestIdealString(String s, int k) {
        int[][] dp=new int[s.length()+1][150];
        for(int[] ar:dp) Arrays.fill(ar,-1);
        return helper(0,s,k,' ',dp);
    }
    public int helper(int i,String s,int k,char c,int[][] dp){
        if(i==s.length())return 0;
        if(dp[i][c]!=-1)return dp[i][c];
        int p=0;
        if(Math.abs(c-s.charAt(i))<=k || c==' ')p=1+helper(i+1,s,k,s.charAt(i),dp);
        int np=helper(i+1,s,k,c,dp);
        return dp[i][c]=Math.max(p,np);

    }
}
