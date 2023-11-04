package day16;

import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-product-after-k-increments/
public class Problem2233 {public int maximumProduct(int[] nums, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int i:nums)pq.add(i);
    int MOD=1000000007;
    while(k>0){
        int t=pq.poll();
        pq.add(t+1);
        k--;
    }
    long ans=1;
    while(!pq.isEmpty()){
        ans=(ans*pq.poll());
        ans=ans%MOD;
    }
    return (int)ans%MOD;
}

}
