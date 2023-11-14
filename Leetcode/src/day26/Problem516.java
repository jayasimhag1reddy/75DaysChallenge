package day26;

import java.util.Arrays;

//https://leetcode.com/problems/longest-palindromic-subsequence/
public class Problem516 {
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int[] ar:dp) Arrays.fill(ar,-1);
        return helper(s,0,s.length()-1,dp);
    }
    public int helper(String s,int i,int j,int[][] dp){
        if(i>=s.length() || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=1+helper(s,i+1,j-1,dp);
        }
        else{
            return dp[i][j]=Math.max(helper(s,i,j-1,dp),helper(s,i+1,j,dp));
        }
    }
}
