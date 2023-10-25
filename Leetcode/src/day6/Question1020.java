package day6;
//https://leetcode.com/problems/number-of-enclaves/
public class Question1020 {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && vis[i][0]==0){
                dfs(i,0,grid,vis,m,n);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[i][n-1]==1 && vis[i][n-1]==0){
                dfs(i,n-1,grid,vis,m,n);
            }
        }
        for(int j=0;j<n;j++){
            if(grid[0][j]==1 && vis[0][j]==0){
                dfs(0,j,grid,vis,m,n);
            }
        }
        for(int j=0;j<n;j++){
            if(grid[m-1][j]==1 && vis[m-1][j]==0){
                dfs(m-1,j,grid,vis,m,n);
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,int[][] grid,int[][] vis,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==1 && vis[i][j]==0){
            vis[i][j]=1;
            dfs(i+1,j,grid,vis,m,n);
            dfs(i,j+1,grid,vis,m,n);
            dfs(i-1,j,grid,vis,m,n);
            dfs(i,j-1,grid,vis,m,n);
        }
    }
}
