package day5;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/shortest-bridge/
public class Question934 {
    public int shortestBridge(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        Queue<int[]> q=new LinkedList<>();
        int tempr=-1;
        int tempc=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    tempr=i;
                    tempc=j;
                }
            }

        }
        dfs(tempr,tempc,grid,vis,m,n,q);
        int ans=Integer.MAX_VALUE;
        int[] dr=new int[]{-1,0,1,0};
        int[] dc=new int[]{0,1,0,-1};
        while(!q.isEmpty()){
            int s=q.size();
            while(s>0){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                int d=temp[2];
                for(int i=0;i<4;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && vis[nr][nc]==0){
                        if(grid[nr][nc]==1){
                            ans=Math.min(ans,d);
                        }
                        else{
                            q.add(new int[]{nr,nc,d+1});
                            vis[nr][nc]=1;
                        }
                    }
                }
                s--;
            }
        }
        return ans;
    }
    public void dfs(int r,int c,int[][] grid,int[][] vis,int m,int n,Queue<int[]> q){
        if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1 && vis[r][c]==0){
            vis[r][c]=1;
            q.add(new int[]{r,c,0});
            dfs(r+1,c,grid,vis,m,n,q);
            dfs(r,c+1,grid,vis,m,n,q);
            dfs(r-1,c,grid,vis,m,n,q);
            dfs(r,c-1,grid,vis,m,n,q);
        }
    }
}
