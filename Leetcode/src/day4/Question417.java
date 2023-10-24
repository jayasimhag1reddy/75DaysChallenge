package day4;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pacific-atlantic-water-flow/
public class Question417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] pac=new int[m][n];
        int[][] alt=new int[m][n];
        for(int i=0;i<n;i++){
            dfs(heights,0,i,pac,m,n,Integer.MIN_VALUE);
        }
        for(int i=0;i<m;i++){
            dfs(heights,i,0,pac,m,n,Integer.MIN_VALUE);
        }
        for(int i=0;i<m;i++){
            dfs(heights,i,n-1,alt,m,n,Integer.MIN_VALUE);
        }
        for(int i=0;i<n;i++){
            dfs(heights,m-1,i,alt,m,n,Integer.MIN_VALUE);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j]==1 && alt[i][j]==1){
                    List<Integer> al=new ArrayList<>();
                    al.add(i);
                    al.add(j);
                    ans.add(al);
                }
            }
        }
        return ans;

    }
    public void dfs(int[][] mat,int r,int c,int[][] vis,int m,int n,int par){
        if(r>=0 && r<m && c>=0 && c<n && vis[r][c]==0 && mat[r][c]>=par){
            vis[r][c]=1;
            dfs(mat,r+1,c,vis,m,n,mat[r][c]);
            dfs(mat,r,c+1,vis,m,n,mat[r][c]);
            dfs(mat,r-1,c,vis,m,n,mat[r][c]);
            dfs(mat,r,c-1,vis,m,n,mat[r][c]);
        }
    }
}
