package day7;

import java.util.*;

//https://leetcode.com/problems/course-schedule-ii/
public class Question210 {
    public int[] findOrder(int n, int[][] pre) {
        int[] ind=new int[n];
        for(int[] ar:pre){
            ind[ar[1]]++;
        }
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i:pre){
            adj.get(i[0]).add(i[1]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(ind[i]==0)q.add(i);
        }
        int[] ans=new int[n];
        int k=n;
        Arrays.fill(ans,-1);
        while(!q.isEmpty()){
            int temp=q.poll();
            ans[--k]=temp;
            for(int i:adj.get(temp)){
                ind[i]--;
                if(ind[i]==0){
                    q.add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(ans[i]==-1)return new int[]{};
        }
        return ans;
    }
}
