package day27;
//https://leetcode.com/problems/house-robber/
public class Problem198 {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int p=nums[i];
            if(i<nums.length-2)p+=dp[i+2];
            int np=-1;
            if(i<nums.length-1){
                np=dp[i+1];
            }
            dp[i]=Math.max(p,np);
        }
        return dp[0];
    }
//    recursive code
    public int helper(int i,int[] nums,int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int p=nums[i]+helper(i+2,nums,dp);
        int np=helper(i+1,nums,dp);
        return dp[i]=Math.max(np,p);
    }
}
