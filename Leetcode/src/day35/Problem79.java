package day35;
//https://leetcode.com/problems/word-search/
public class Problem79 {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j] && helper(board,vis,i,j,m,n,word,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board,boolean[][] vis,int i,int j,int m,int n,String word,int ind){
        if(ind==word.length())return true;
        if(i<0 || i>=m || j<0 || j>=n || vis[i][j] || word.charAt(ind)!=board[i][j]){
            return false;
        }
        vis[i][j]=true;
        boolean res=helper(board,vis,i-1,j,m,n,word,ind+1) ||
                helper(board,vis,i,j+1,m,n,word,ind+1) ||
                helper(board,vis,i+1,j,m,n,word,ind+1) ||
                helper(board,vis,i,j-1,m,n,word,ind+1);
        vis[i][j]=false;
        return res;
    }

}
