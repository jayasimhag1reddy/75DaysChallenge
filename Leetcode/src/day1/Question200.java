package day1;
//https://leetcode.com/problems/number-of-islands/
public class Question200 {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        int[][] vis=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    ans++;
                    dfs(grid,vis,i,j,m,n);
                }
            }
        }
        return ans;
    }
    public static void dfs(char[][] grid,int[][] vis,int i,int j,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && vis[i][j]==0 && grid[i][j]=='1'){
            vis[i][j]=1;
            dfs(grid,vis,i-1,j,m,n);
            dfs(grid,vis,i,j+1,m,n);
            dfs(grid,vis,i+1,j,m,n);
            dfs(grid,vis,i,j-1,m,n);
        }
        return;
    }
}
