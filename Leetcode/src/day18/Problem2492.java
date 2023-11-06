package day18;

import java.util.*;

//https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/
public class Problem2492 {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> al=new ArrayList<>();
        for(int i=0;i<=n;i++){
            al.add(new ArrayList<>());
        }
        for(int[] ar:roads){
            al.get(ar[0]).add(new int[]{ar[1],ar[2]});
            al.get(ar[1]).add(new int[]{ar[0],ar[2]});
        }
        boolean[] vis=new boolean[n+1];
        int[] ans=new int[1];
        ans[0]=Integer.MAX_VALUE;
        dfs(1,al,vis,ans);
        return ans[0];
    }
    public void dfs(int node,List<List<int[]>> al,boolean[] vis,int[] ans){
        vis[node]=true;
        for(int[] ar:al.get(node)){
            ans[0]=Math.min(ans[0],ar[1]);
            if(vis[ar[0]]==false){
                dfs(ar[0],al,vis,ans);
            }
        }
    }
}
