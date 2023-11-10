package day22;
//https://leetcode.com/problems/maximal-network-rank/
public class Problem1615 {
    public int maximalNetworkRank(int n, int[][] roads) {
        int[] deg=new int[n];
        int[][] con=new int[n][n];
        for(int[] ar:roads){
            deg[ar[0]]++;
            deg[ar[1]]++;
            con[ar[0]][ar[1]]=1;
            con[ar[1]][ar[0]]=0;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(con[i][j]==1 || con[j][i]==1){
                        ans=Math.max(ans,deg[i]+deg[j]-1);
                    }
                    else{
                        ans=Math.max(ans,deg[i]+deg[j]);
                    }
                }
            }
        }
        return ans;
    }
}
