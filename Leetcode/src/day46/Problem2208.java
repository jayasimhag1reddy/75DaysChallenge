package day46;

import java.util.Comparator;
import java.util.PriorityQueue;
//https://leetcode.com/problems/minimum-operations-to-halve-array-sum/
public class Problem2208 {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<Double>(Comparator.reverseOrder());
        double sum=0;
        for(int i:nums){
            pq.add((double)i);
            sum+=i;
        }
        double half=sum;
        int ans=0;
        while(half>sum/2){
            ans++;
            double a=pq.poll()/2;
            half-=a;
            pq.add(a);
        }
        return ans;
    }
}
