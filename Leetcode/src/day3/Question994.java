package day3;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/
public class Question994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int n=grid.length; int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    vis[i][j]=true;
                }
                else if(grid[i][j]==1){
                    count++;
                }
            }
        }
        int[] delr={-1,0,1,0};
        int[] delc={0,1,0,-1};
        int ans=0;
        int cn=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size>0){
                int[] temp=q.poll();
                int r=temp[0]; int c=temp[1];
                for(int i=0;i<4;i++){
                    int nr=r+delr[i];
                    int nc=c+delc[i];
                    if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==false && grid[nr][nc]==1){
                        q.add(new int[]{nr,nc});
                        grid[nr][nc]=2;
                        cn++;
                        vis[nr][nc]=true;

                    }
                }
                size--;
            }
            if(!q.isEmpty()){
                ans++;
            }
        }
        if(cn!=count)return -1;
        return ans;
    }
}
