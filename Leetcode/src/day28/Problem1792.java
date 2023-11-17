package day28;

import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-average-pass-ratio/
public class Problem1792 {
    public double maxAverageRatio(int[][] cls, int e) {
        PriorityQueue<int []> pq=new PriorityQueue<>((a, b)->{
            double d0=(double)(a[0]+1)/(a[1]+1) - (double)(a[0])/a[1];
            double d1=(double)(b[0]+1)/(b[1]+1) - (double)(b[0])/b[1];
            if(d1>d0) return 1;
            else return -1;
        });
        for(int[] ar:cls){
            pq.add(ar);
        }
        double ans=0;
        while(e>0){
            int[] ar=pq.poll();
            ar[0]+=1;
            ar[1]+=1;
            pq.add(ar);
            e--;
        }
        while(!pq.isEmpty()){
            int[] ar=pq.poll();
            ans+=(double)ar[0]/(double)ar[1];
        }
        return ans/cls.length;
    }
}
