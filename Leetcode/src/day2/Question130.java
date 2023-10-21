package day2;
//https://leetcode.com/problems/surrounded-regions/
public class Question130 {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] vis=new int[m][n];
        for(int i=0;i<n;i++){
            if(board[0][i]=='O'){
                dfs(board,vis,0,i,m,n);
            }
        }
        for(int i=1;i<m;i++){
            if(board[i][n-1]=='O'){
                dfs(board,vis,i,n-1,m,n);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(board[m-1][i]=='O'){
                dfs(board,vis,m-1,i,m,n);
            }
        }
        for(int i=m-1;i>=0;i--){
            if(board[i][0]=='O'){
                dfs(board,vis,i,0,m,n);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][] board,int[][] vis,int i,int j,int m,int n){
        if(i>=0 && i<m && j>=0 && j<n && vis[i][j]==0 && board[i][j]=='O'){
            vis[i][j]=1;
            dfs(board,vis,i-1,j,m,n);
            dfs(board,vis,i,j+1,m,n);
            dfs(board,vis,i+1,j,m,n);
            dfs(board,vis,i,j-1,m,n);
        }
        else{
            return;
        }
    }
}
