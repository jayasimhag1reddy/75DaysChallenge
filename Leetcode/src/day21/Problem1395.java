package day21;
//
public class Problem1395 {
    public int numTeams(int[] nums) {
        Integer[][][] dp1=new Integer[nums.length][nums.length+1][4];
        Integer[][][] dp2=new Integer[nums.length][nums.length+1][4];
        return helper1(0,nums,3,-1,dp1)+helper2(0,nums,3,-1,dp2);

    }
    public int helper1(int i,int[] nums,int c,int prev,Integer[][][] dp){
        if(c==0)return 1;
        if(i>=nums.length)return 0;
        int p=0;
        if(dp[i][prev+1][c]!=null)return dp[i][prev+1][c];
        if(prev==-1 || nums[i]>nums[prev]){
            p=helper1(i+1,nums,c-1,i,dp);
        }
        int np=helper1(i+1,nums,c,prev,dp);
        return dp[i][prev+1][c]=p+np;
    }
    public int helper2(int i,int[] nums,int c,int prev,Integer[][][] dp){
        if(c==0)return 1;
        if(i>=nums.length)return 0;
        int p=0;
        if(dp[i][prev+1][c]!=null)return dp[i][prev+1][c];
        if(prev==-1 || nums[i]<nums[prev]){
            p=helper2(i+1,nums,c-1,i,dp);
        }
        int np=helper2(i+1,nums,c,prev,dp);
        return dp[i][prev+1][c]=p+np;
    }
}
