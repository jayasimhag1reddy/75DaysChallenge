package day46;

import java.util.PriorityQueue;

//https://leetcode.com/problems/furthest-building-you-can-reach/
public class Problem1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
        for(int i=1;i<heights.length;i++){
            if(heights[i]<=heights[i-1])continue;
            bricks-=heights[i]-heights[i-1];
            pq.add(heights[i]-heights[i-1]);

            if(bricks<0){
                bricks+=pq.poll();
                if(ladders>0)ladders--;
                else{
                    return i-1;
                }
            }
        }
        return heights.length-1;
    }

}
