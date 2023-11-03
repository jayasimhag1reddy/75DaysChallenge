package day15;

import java.util.Arrays;

//https://leetcode.com/problems/find-closest-node-to-given-two-nodes/
public class Problem2359 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n=edges.length;
        int[] dist1=new int[n];
        int[] dist2=new int[n];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2,Integer.MAX_VALUE);
        int[] vis1=new int[n];
        int[] vis2=new int[n];
        dist1[node1]=0;
        dist2[node2]=0;
        dfs(node1,edges,dist1,vis1);
        dfs(node2,edges,dist2,vis2);
        int ans=-1;
        int minDist=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(minDist>Math.max(dist1[i],dist2[i])){
                ans=i;
                minDist=Math.max(dist1[i],dist2[i]);
            }
        }
        return ans;

    }
    public void dfs(int node,int[] edges,int[] dist,int[] vis){
        vis[node]=1;
        int nxt=edges[node];
        if(nxt!=-1 && vis[nxt]==0){
            dist[nxt]=1+dist[node];
            dfs(nxt,edges,dist,vis);
        }
    }
}
