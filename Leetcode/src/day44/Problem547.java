package day44;
//https://leetcode.com/problems/number-of-provinces/
public class Problem547 {
    public int findCircleNum(int[][] isConnected) {
        int len=isConnected.length;
        int ans=0;
        int[] vis=new int[len];
        for(int i=0;i<len;i++){
            if(vis[i]!=1){
                ans++;
                dfs(i,isConnected,vis);
            }
        }
        return ans;
    }
    public void dfs(int node,int[][] isConnected,int[] vis){
        vis[node]=1;
        for(int i=0;i<vis.length;i++){
            if(isConnected[node][i]==1 && vis[i]!=1){
                dfs(i,isConnected,vis);
            }
        }
    }
}
