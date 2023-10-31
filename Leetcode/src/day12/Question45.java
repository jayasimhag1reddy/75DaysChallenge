package day12;

import java.util.Arrays;

//https://leetcode.com/problems/jump-game-ii/
public class Question45 {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
    public int helper(int i,int[] nums,int[] dp){
        if(i>=nums.length-1)return 0;
        if(dp[i]!=-1)return dp[i];
        int ans=10001;
        for(int j=i+1;j<=i+nums[i];j++){
            ans=Math.min(ans,1+helper(j,nums,dp));
        }
        return dp[i]=ans;
    }
}
