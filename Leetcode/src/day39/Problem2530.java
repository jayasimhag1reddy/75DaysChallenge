package day39;

import java.util.PriorityQueue;

//https://leetcode.com/problems/maximal-score-after-applying-k-operations/
public class Problem2530 {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
        for(int i:nums){
            pq.add(i);
        }
        long ans=0;
        while(k>0){
            int t=pq.poll();
            ans+=t;
            if(t%3==0){
                pq.add(t/3);
            }
            else{
                pq.add((t/3)+1);
            }
            k--;
        }
        return ans;
    }
}
