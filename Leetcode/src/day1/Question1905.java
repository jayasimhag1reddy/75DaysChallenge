package day1;
//https://leetcode.com/problems/count-sub-islands/
public class Question1905 {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m=grid1.length;
        int n=grid1[0].length;
        //int[][] vis=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1){
                    if(dfs(i,j,m,n,grid1,grid2)){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public boolean dfs(int i,int j,int m,int n,int[][] grid1,int[][] grid2){
        boolean res=true;
        if(i>=0 && i<m && j>=0 && j<n && grid2[i][j]==1){
            if(grid1[i][j]!=grid2[i][j]) res= false;
            grid2[i][j]=-1;
            boolean up=dfs(i-1,j,m,n,grid1,grid2);
            boolean right=dfs(i,j+1,m,n,grid1,grid2);
            boolean left=dfs(i+1,j,m,n,grid1,grid2);
            boolean down=dfs(i,j-1,m,n,grid1,grid2);
            if(!up || !right || !left || !down)return false;
        }
        return res;
    }
}
