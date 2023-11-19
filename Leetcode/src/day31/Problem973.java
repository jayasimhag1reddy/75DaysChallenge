package day31;

import java.util.PriorityQueue;

//https://leetcode.com/problems/k-closest-points-to-origin/
public class Problem973 {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<int[]> pq=new PriorityQueue<>((p1, p2) -> ((p1[0]*p1[0])+(p1[1]*p1[1])) - ((p2[0]*p2[0])+(p2[1]*p2[1])));
        for(int[] arr:points){
            pq.add(arr);
        }
        while(k>0){
            ans[k-1]=pq.poll();
            k--;
        }
        return ans;
    }
}
