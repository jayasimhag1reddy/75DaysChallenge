package day15;
//https://leetcode.com/problems/is-graph-bipartite/
public class Problem785 {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] col=new int[n];
        for(int i=0;i<n;i++){
            if(col[i]==0 && !isValid(i,graph,col,1)){
                return false;
            }
        }
        return true;
    }
    public boolean isValid(int node,int[][] graph,int[] col,int clr){
        if(col[node]!=0){
            return col[node]==clr;
        }
        col[node]=clr;
        for(int n:graph[node]){
            if(!isValid(n,graph,col,-clr)){
                return false;
            }
        }
        return true;
    }
}
