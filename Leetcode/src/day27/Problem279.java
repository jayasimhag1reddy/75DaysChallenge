package day27;
//https://leetcode.com/problems/perfect-squares/
public class Problem279 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(min,1+dp[i-(j*j)]);
                dp[i]=min;
            }
        }
        return dp[n];
    }
//    recusrsive code
    public int helper(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n<0){
            return 100000;
        }
        if(dp[n]!=-1)return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            min=Math.min(min,1+helper(n-(i*i),dp));
        }
        return dp[n]=min;
    }
}
