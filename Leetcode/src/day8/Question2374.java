package day8;
//https://leetcode.com/problems/node-with-highest-edge-score/
public class Question2374 {
    public int edgeScore(int[] edges) {
        int n=edges.length;
        long[] sum=new long[n];
        for(int i=0;i<n;i++){
            sum[edges[i]]+=i;
        }
        long max=-1;
        int node=-1;
        for(int i=0;i<n;i++){
            if(sum[i]>max){
                max=sum[i];
                node=i;
            }
        }
        return node;
    }
}
