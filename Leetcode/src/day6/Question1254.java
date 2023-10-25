package day6;
//https://leetcode.com/problems/number-of-closed-islands/
public class Question1254 {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        int [][] vis=new int[m][n];
        for(int i=0;i<n;i++){
            if(grid[0][i]==0 && vis[0][i]==0){
                dfs(grid,vis,0,i,m,n);
            }
        }
        for(int i=0;i<m;i++){
            if(grid[i][n-1]==0 && vis[i][n-1]==0){
                dfs(grid,vis,i,n-1,m,n);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(grid[m-1][i]==0 && vis[m-1][i]==0){
                dfs(grid,vis,m-1,i,m,n);
            }
        }
        for(int i=m-1;i>=0;i--){
            if(grid[i][0]==0 && vis[i][0]==0){
                dfs(grid,vis,i,0,m,n);
            }
        }
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(grid[i][j]==0 && vis[i][j]==0){
                    dfs(grid,vis,i,j,m,n);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] grid,int [][] vis,int i,int j,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==0 && vis[i][j]==0){
            vis[i][j]=1;
            dfs(grid,vis,i-1,j,m,n);
            dfs(grid,vis,i,j+1,m,n);
            dfs(grid,vis,i+1,j,m,n);
            dfs(grid,vis,i,j-1,m,n);
        }
        return;
    }
}
