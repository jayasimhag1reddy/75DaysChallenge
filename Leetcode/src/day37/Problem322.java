package day37;
//https://leetcode.com/problems/coin-change/
public class Problem322 {
    public int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        if(helper(amount,coins,dp)>=10001){
            return -1;
        }
        return helper(amount,coins,dp);
    }
    public int helper(int amount,int[] coins,int[] dp){
        if(amount==0)return 0;
        if(amount<0)return 100001;
        if(dp[amount]!=-1)return dp[amount];
        int ans=10001;
        for(int i:coins){
            ans=Math.min(ans,1+helper(amount-i,coins,dp));
        }
        return dp[amount]=ans;
    }
}
