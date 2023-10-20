package day1;
//https://leetcode.com/problems/max-area-of-island/
public class Question695 {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        int[] ans=new int[1];
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    dfs(grid,vis,i,j,m,n,ans);
                    if(ans[0]>max){
                        max=ans[0];
                    }
                    ans[0]=0;
                }
            }
        }
        return max;
    }
    public void dfs(int[][] grid,int[][] vis,int i,int j,int m,int n,int[] ans){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==1 && vis[i][j]==0){
            ans[0]++;
            vis[i][j]=1;
            dfs(grid,vis,i-1,j,m,n,ans);
            dfs(grid,vis,i,j+1,m,n,ans);
            dfs(grid,vis,i+1,j,m,n,ans);
            dfs(grid,vis,i,j-1,m,n,ans);
        }
    }
}
