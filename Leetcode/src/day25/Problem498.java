package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/diagonal-traverse/
public class Problem498 {
    public int[] findDiagonalOrder(int[][] mat) {
        Queue<Node> q=new LinkedList<>();
        int s=mat.length*mat[0].length;
        int m=mat.length;
        int n=mat[0].length;
        int[][] vis=new int[m][n];
        q.add(new Node(mat[0][0],0,0));
        vis[0][0]=1;
        int[] ans=new int[s];
        int i=0;
        boolean lev=true;
        while(!q.isEmpty()){
            int si=q.size();
            List<Integer> al=new ArrayList<>();
            while(si>0){
                Node temp=q.poll();
                al.add(temp.val);
                if(temp.j+1<n && vis[temp.i][temp.j+1]==0){
                    vis[temp.i][temp.j+1]=1;
                    q.add(new Node(mat[temp.i][temp.j+1],temp.i,temp.j+1));
                }
                if(temp.i+1< m && vis[temp.i+1][temp.j]==0){
                    vis[temp.i+1][temp.j]=1;
                    q.add(new Node(mat[temp.i+1][temp.j],temp.i+1,temp.j));
                }
                si--;
            }
            if(lev){
                for(int j=al.size()-1;j>=0;j--){
                    ans[i++]=al.get(j);
                }
            }
            else{
                for(int j=0;j<al.size();j++){
                    ans[i++]=al.get(j);
                }
            }
            lev=!lev;
        }
        return ans;
    }
}
class Node{
    int val;
    int i;
    int j;
    public Node(int val,int i,int j){
        this.val=val;
        this.i=i;
        this.j=j;
    }
}

