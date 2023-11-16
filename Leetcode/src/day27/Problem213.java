package day27;

import java.util.Arrays;

//https://leetcode.com/problems/house-robber-ii/
public class Problem213 {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int[] dp=new int[nums.length];
        int[] dp1=new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        return Math.max(helper(0,nums.length-1,nums,dp),helper(1,nums.length,nums,dp1));
    }
    public int helper(int i,int j,int[] nums,int[] dp){
        if(i>=j)return 0;
        if(dp[i]!=-1)return dp[i];
        int p=nums[i]+helper(i+2,j,nums,dp);
        int np=helper(i+1,j,nums,dp);
        return dp[i]=Math.max(np,p);
    }
}
