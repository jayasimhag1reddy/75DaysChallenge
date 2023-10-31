package day12;
//https://leetcode.com/problems/battleships-in-a-board/
public class Question419 {
    public int countBattleships(char[][] board) {
        int[][] vis=new int[board.length][board[0].length];
        int ans=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='X' && vis[i][j]==0){
                    ans++;
                    if(j<board[0].length-1 && board[i][j+1]=='X'){
                        helper(i,j,board,vis,true);
                    }
                    else{
                        helper(i,j,board,vis,false);
                    }
                }
            }
        }
        return ans;
    }
    public void helper(int r,int c,char[][] board,int[][] vis,boolean hor){
        if(r>=0 && c>=0 && r<board.length && c<board[0].length && vis[r][c]==0 && board[r][c]=='X'){
            vis[r][c]=1;
            if(hor){
                helper(r,c+1,board,vis,true);
            }
            else{
                helper(r+1,c,board,vis,false);
            }
        }
    }

}
