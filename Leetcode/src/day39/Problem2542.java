package day39;

import java.util.Arrays;
import java.util.PriorityQueue;

//https://leetcode.com/problems/maximum-subsequence-score/
public class Problem2542 {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i]=new int[]{nums1[i],nums2[i]};
        }
        Arrays.sort(arr,(a, b)->b[1]-a[1]);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i][0];
            pq.add(arr[i][0]);
        }
        long ans=sum*arr[k-1][1];
        for(int i=k;i<n;i++){
            sum+=arr[i][0];
            sum-=pq.poll();
            pq.add(arr[i][0]);
            ans=Math.max(ans,sum*arr[i][1]);
        }
        return ans;
    }
}
