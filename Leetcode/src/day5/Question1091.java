package day5;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/shortest-path-in-binary-matrix/
public class Question1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1)return -1;
        Queue<int[]> q=new LinkedList<>();
        int[][] vis=new int[m][n];
        q.add(new int[]{0,0,1});
        vis[0][0]=1;
        int[] dr=new int[]{-1,-1,-1,0,1,1,1,0};
        int[] dc=new int[]{-1,0,1,1,1,0,-1,-1};
        int ans=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int s=q.size();
            while(s>0){
                int[] temp=q.poll();
                int r=temp[0];
                int c=temp[1];
                int d=temp[2];
                if(r==m-1 && c==n-1)return d;
                for(int i=0;i<8;i++){
                    int nr=r+dr[i];
                    int nc=c+dc[i];
                    if(nr>=0 && nr<m && nc>=0 && nc<n && vis[nr][nc]==0 && grid[nr][nc]==0){
                        if(nr==m-1 && nc==n-1){
                            ans=Math.min(ans,d+1);
                        }
                        else{
                            vis[nr][nc]=1;
                            q.add(new int[]{nr,nc,d+1});
                        }
                    }
                }
                s--;
            }
        }
        if(ans==Integer.MAX_VALUE)return -1;
        return ans;
    }
}
